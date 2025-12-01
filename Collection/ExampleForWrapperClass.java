package Collection;

public class ExampleForWrapperClass {
	public static void main(String[] args) {
	
		// Primitive Data Type
		int primitiveInt = 50;

		// Auto-BOXING: Java automatically converts the 'int' (primitiveInt) 
		// into an 'Integer' object and stores it in wrapperObject.
		Integer wrapperObject = primitiveInt; 

		// Proof: wrapperObject is a true object, so you can call methods on it.
		System.out.println("Wrapper Object value: " + wrapperObject);
		
		
		// Wrapper Class Object
		Integer wrapperValue = new Integer(100);

		// Auto-UNBOXING: Java automatically converts the 'Integer' object 
		// (wrapperValue) back into an 'int' primitive and stores it in primitiveInt.
		int primitiveInts = wrapperValue; 

		// Proof: We can use the result in primitive arithmetic.
		int result = primitiveInts + 5;
		System.out.println("Result of primitive addition: " + result);
	}
}
