package inheritence;

class CreditCard { //parent class
    int cardNo = 12345;
    int pin = 1111;
}

class Hacker extends CreditCard { //child class
    void viewDetails() {
        System.out.println(cardNo); //inherited variables
        System.out.println(pin);
    }

    void changeDetails() {
        cardNo = 98765;
        pin = 6666;
    }
}
public class ExampleOfInheritence {

	public static void main(String[] args) {
		Hacker hack = new Hacker();
		hack.viewDetails();
		//hack.changeDetails();
	}

}
