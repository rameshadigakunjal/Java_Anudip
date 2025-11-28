package Threads;

import java.util.Scanner;

class Demo11 implements Runnable{
	public void run() {
		Thread t = Thread.currentThread();
	    String name = t.getName();
	    
	    // Check if the thread name is "ADD"
	    if (name.equals("ADD") == true) {
	        add();
	    } 
	    // Check if the thread name is "CHAR"
	    else if (name.equals("CHAR") == true) {
	        CharectoePrint();
	    } 
	    // Default execution
	    else {
	        numPrint();
	    }
	}
	void add() {
		System.out.println("Addition task started");
	    Scanner s = new Scanner(System.in);

	    System.out.println("Enter the first number");
	    int a = s.nextInt();

	    System.out.println("Enter the second number");
	    int b = s.nextInt();

	    int sum = a + b;
	    System.out.println(sum);
	    System.out.println("Addition task is completed");
	}
	
	void CharectoePrint() {
		System.out.println("Character printing task started");

        // Loop runs from 65 (ASCII for 'A') to 75 (ASCII for 'K')
        for (int i = 65; i <= 75; i++) {
            System.out.println((char) i);

            try {
                // Pause for 4000 milliseconds (4 seconds)
                Thread.sleep(4000);
            } catch (Exception e) {
                // Catches InterruptedException if the thread is interrupted
                System.out.println("Some problem occured");
            }
        }
        System.out.println("Character printing task completed");
    
	}
	void numPrint() {
		System.out.println("Number printing task started");

	    for(int i = 1; i <= 10; i++) {
	        System.out.println(i);
	        try {
	            Thread.sleep(4000);
	        } catch(Exception e) {
	            System.out.println("Some problem occured");
	        }
	    }
	    System.out.println("Number printing task completed");
	}
}
public class Using_Runnable {
    public static void main(String[] args) {
        	Demo11 d11 = new Demo11();
		
		Thread t1 = new Thread(d11);
		Thread t2 = new Thread(d11);
		Thread t3 = new Thread(d11);

		t1.setName("ADD");
		t2.setName("CHAR");
		t3.setName("NUM");
		
		t1.start();
		t2.start();
		t3.start();
	
    }
}
