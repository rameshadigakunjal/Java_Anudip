package Lab_Program.Lab_6;

import java.util.ArrayList;

public class SumEvenNumbers {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(2);
		al.add(5);
		al.add(8);
		al.add(10);
		al.add(15);
		
		int sum = 0;
		
		for(int i: al) {
			if(i%2 == 0) {
				sum+=i;
			}
		}
		System.out.println("Sum of Even Numbers: "+sum);
	}
}
	