package Threads;

import java.util.Scanner;

class AdditionTask extends Thread {
    @Override
    public void run() {
        System.out.println("-> Addition Task started by: " + Thread.currentThread().getName());
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            int a = s.nextInt();

            System.out.print("Enter the second number: ");
            int b = s.nextInt();

            int sum = a + b;
            System.out.println("-> Result: Sum = " + sum);
        } catch (Exception e) {
            System.out.println("Addition Task Interrupted or Input Error.");
        }
        System.out.println("-> Addition Task is completed.");
    }
}

// --- 2. CharCountTask Thread ---
// Counts characters in a predefined string and sleeps intermittently.
class CharCountTask extends Thread {
    private String text = "Multithreading in Java is powerful.";

    @Override
    public void run() {
        System.out.println("-> Char Count Task started by: " + Thread.currentThread().getName());
        int count = 0;
        
        for (char c : text.toCharArray()) {
            // Introduce a short delay to better show concurrency
            try {
                Thread.sleep(50); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            count++;
        }
        System.out.println("-> Result: Total characters counted: " + count);
        System.out.println("-> Char Count Task is completed.");
    }
}

public class ConcurentExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdditionTask thread1 = new AdditionTask();
        CharCountTask thread2 = new CharCountTask();

        // Name the threads for clearer output
        thread1.setName("Adder-Thread");
        thread2.setName("Counter-Thread");

        // Start both threads simultaneously
        // The start() method calls the run() method of each thread concurrently.
        thread1.start();
        thread2.start();
        
        System.out.println("\n--- Main thread finished starting all tasks ---");
	}

}
