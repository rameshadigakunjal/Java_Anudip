package Collection;

import java.util.Stack;

public class StackClass {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		
		s.push(100);
		s.push(20);
		s.push(21);
		
		for(Object i: s) {
			System.out.println(i);
		}
		
		System.out.println("==============");
		
		System.out.println(s.peek());
	}
}

