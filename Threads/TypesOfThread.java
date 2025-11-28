package Threads;

class Demo12 extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("user thered is exicuted");
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println("Some problem occured");
			}
		}
	}
}

class Demo13 extends Thread{
	public void run() {
		for(;;) {
			System.out.println("Deamon Thread is exicuted");
			try {
				
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println("Some Problem occured");
			}
		}
	}
	
}
public class TypesOfThread {
	public static void main(String[] args) {
		System.out.println("Main() started exicution");
		
		Demo12 d12 =new Demo12();
		Demo13 d13 =new Demo13();
		
		d12.setDaemon(false);
		d12.start();
		d13.start();
		System.out.println("Main() finished execution. Waiting for User threads to complete.");
	}
}