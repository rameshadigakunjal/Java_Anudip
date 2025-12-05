package ExampleProblem;


public class Palindrome {
    	public static boolean isPailndrome(int num) {

          int originNum = num;
		int revNum  = 0;
		
		while(num>0) {
			int digit = num % 10;
			revNum = revNum * 10+ digit;
			num/=10;
			
		}
		
		return originNum == revNum;
	}

	public static void main(String[] args) {
		int n1 = 121;
		int n2 = 123;
		
		System.out.println(n1+ "Palindrome number is: " +isPailndrome(n1));
		System.out.println(n2+ "Palindrome number is: " + isPailndrome(n2));
		
		
    }
}
