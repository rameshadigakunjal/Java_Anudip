package Exception;


public class ExceptionHandling {
	
	void div() throws Exception {
		int a = 40;
		int b = 0;
		System.out.println(a/b);
	}

	public static void main(String[] args) {
		ExceptionHandling e = new ExceptionHandling();
		try {
			e.div();

		}
		catch(Exception a) {
			a.printStackTrace();
		}
		
		//checked exception
	/*	for(int i = 1;i<=5;i++)
		{
			System.out.println(i);
			Thread.sleep(10);
		} */
		
		//Unchecked Exception
		/*int a[] = {10,20,30,40};
		System.out.println(a[6]);  */
		
		int num1 = 50;
		int num2 = 0;
		
		/*try {
			int result = num1/num2;
			System.out.println(result);
		}
		catch(ArithmeticException e) {
			System.out.println("Cant divide by Zero!!\n"+e.getMessage());
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Some Problem occured!!");
		}
		//super class exception in the last because all the hand 
		catch(Exception e) {
			
		}
		finally {
			System.out.println("this is finally blocks");
		}
		
		*/
		
		
		
	}

}


