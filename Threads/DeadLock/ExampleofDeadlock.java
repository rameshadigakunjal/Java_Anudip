package Threads.DeadLock;

class Family implements Runnable{
	String resource1 = "Tv";
	String resource2 =  "Plastation";
	
	public void run() {
		String  name = Thread.currentThread().getName();
		if(name.equals("ramesh")==true)
		{
			rameshAccquireResource();
		}
		else {
			pavanAccquiredResource();
		}
	}
	void rameshAccquireResource() {
		synchronized(resource2) {
			try {
				System.out.println("Ramesh Accquired Playstation");
				Thread.sleep(1000);
				synchronized(resource1) {
					System.out.println("ramesh accquired tv");
					Thread.sleep(1000);
				}
			}
		
		catch(Exception e) {
			System.out.println("Rohit Failed");
		}
	}
}
	void pavanAccquiredResource() {
		synchronized(resource1) {
			try {
				System.out.println("pavan aquired Tv");
				Thread.sleep(1000);
				synchronized(resource2) {
					System.out.println("Pavan aquire play station");
					Thread.sleep(1000);
				}
			}
			catch(Exception e) {
				System.out.println("Pavan failed");
			}
		}
			
		}
	}
public class ExampleofDeadlock {
	public static void main(String[] args) {
		Family f = new Family();
		Thread t1 = new Thread(f);
		Thread t2  =new Thread(f);
		
		t1.setName("Ramesh");
		t2.setName("Pavan");
		
		t1.start();
		t2.start();
		
		
			}
}
