package Threads;

import java.util.Scanner;

class Demo1 extends Thread
{
	public void run()
	{
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
}

class Demo2 extends Thread
{
	public void run()
	{
      System.out.println("Character printing task started");
		
		for(int i=65;i<=75;i++)
		{
			System.out.println((char)i);
			try {
			Thread.sleep(4000);
			}
			catch(Exception e)
			{
				System.out.println("Some problem occured");
			}
		}
		System.out.println("Character printing task completed");
	}
}
class Demo3 extends Thread
{
	public void run()
	{
        System.out.println("Number printing task started");
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			try {
			Thread.sleep(4000);
			}
			catch(Exception e)
			{
				System.out.println("Some problem occured");
			}
		}
		
		System.out.println("Number printing task completed");
	}
}
public class Demo {
    public static void main(String[] args) throws Exception{
		
		
		Demo1 d1 = new Demo1();
		Demo2 d2 = new Demo2();
		Demo3 d3 = new Demo3();
		
		d1.start();
		
		System.out.println("======================================");
		
		d2.start();
		
		System.out.println("======================================");
		
        d3.start();
	}

    
}
