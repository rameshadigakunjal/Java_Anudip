package Lab_Program.Lab_5;

class AverageThread extends Thread{
	public void run() {
		int sum =0;
		for(int i=1;i<=10;i++) {
			sum+=i;
		}
		double avg  =sum/10.0;
		System.out.println("Aveg of First 10 number "+ avg);
	}
}
class SquareThread extends Thread{
	int arr[]= {1,20,50,15,30};
	public void run() {
		System.out.println("Square of number in the array: ");
		for(int n: arr) {
			System.out.println("Square of "+ n + ": " + (n*n));
		}
	}
}
public class ThreadOrder {
	public static void main(String[] args) throws InterruptedException {
		SquareThread sq = new SquareThread();
		AverageThread avg  =new AverageThread();
		
		sq.start();
		sq.join();    // ensure sq thread completes first
		
		avg.start();
		avg.join();	    // ensure avg finishes
	}
}
