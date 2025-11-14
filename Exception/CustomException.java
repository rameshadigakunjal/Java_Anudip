package Exception;

import java.util.Scanner;

class InvalidUserIDException extends Exception{
	public String getMessage() {
		return("invalid card details. Try Again");
	}
}
class ATM{
	int acc_num = 12345678;
	int password  =11111;
	int an, pwd;
	
	void acceptInput() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the account number: ");
		an =sc.nextInt();
		System.out.println("Enter the password:");
		pwd = sc.nextInt();
	}
	void verfy() throws InvalidUserIDException{
		if(acc_num == an && password == pwd) {
			System.out.println("Collect the money");
		}
		else {
			InvalidUserIDException i =new InvalidUserIDException();
			System.out.println(i.getMessage());
			throw i;
		}
	}
}
public class CustomException {

	public static void main(String[] args) {
		ATM atm = new ATM();
		
		try {
			atm.acceptInput();
			atm.verfy();
		}
		catch(Exception e) {
			try {
				atm.acceptInput();
				atm.verfy();
			}
			catch(Exception b) {
				System.out.println("Card is dead!!");
			}
		}
	}

}

