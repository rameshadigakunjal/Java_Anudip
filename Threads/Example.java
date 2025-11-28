package Threads;

class Printer implements Runnable {
    
    // The 'synchronized' keyword on the method is redundant when the entire 
    // body is wrapped in 'synchronized(this)'. We'll simplify the synchronization.
    
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        
        // --- Synchronization Block ---
        // Only one thread can execute the code inside this block at a time
        // using the 'p' object as the lock.
        synchronized(this) { 
            System.out.println(name + " executing first time (Synchronized)");
            
            try {
                // ERROR FIX: Replaced 'Thread.sleep(null)' with a valid duration (100ms)
                Thread.sleep(100); 
            }
            // FIX: Use InterruptedException, as sleep() only throws this checked exception
            catch(InterruptedException e) {
                // In a real application, we would handle the interruption properly
                Thread.currentThread().interrupt(); 
                e.printStackTrace();
            }
            System.out.println(name + " is executing first line (Leaving Lock)");
        }
        // --- End Synchronization Block ---
        
        // This part runs concurrently (without the lock)
        System.out.println(name + " started Printing (Concurrent)");
        
        for(int i = 1; i <= 3; i++) {
            System.out.println(name + " is Printing item " + i);
            try {
                // Wait for 4 seconds
                Thread.sleep(4000); 
            }
            catch(InterruptedException e) { // FIX: Use correct exception type
                System.out.println(name + ": Printing interrupted");
                Thread.currentThread().interrupt(); 
            }
        }
        System.out.println(name + " Completed printing");
    }
}

public class Example {
    public static void main(String[] args) {
        
        // 1. Create one instance of the Runnable target (Lock Object)
        Printer p = new Printer();
        
        // 2. FIX: Threads must be initialized with the Runnable instance 'p'.
        // This tells the threads to execute the 'p.run()' method.
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(p);
        Thread t3 = new Thread(p);
        
        // 3. FIX: Simplified names for clearer output.
        // We use the Thread name itself, not a descriptive sentence.
        t1.setName("ABC");
        t2.setName("XYZ");
        t3.setName("LMO");
        
        // 4. Start threads
        t1.start();
        t2.start();
        t3.start();
        
        System.out.println("Main thread launched all printing tasks.");
    }
}