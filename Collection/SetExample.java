package Collection;

import java.util.HashSet;
//import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {
	public static void main(String[] args) {
//		HashSet<Integer> s = new HashSet<Integer>();
//		
//		s.add(100);
//		s.add(200);
//		s.add(300);
//		
//		System.out.println(s);
//		
//		System.out.println("============");
//		
//		for(Object i: s) {
//			System.out.println(i);
//		}
//		
//		System.out.println("-------LinkedHashSEt------");
//		
//		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
//		lhs.add(10);
//		lhs.add(20);
//		lhs.add(30);
//		
//		System.out.println(lhs);
//		
//		// Correction: Change 'Object i' to 'Integer i' to match the set's generic type.
//		for(Integer i : lhs) { 
//			System.out.println(i);
//		}
//		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(10);
		ts.add(20);
		ts.add(30);
		
		System.out.println(ts);
		
		// Correction: Change 'Object i' to 'Integer i' to match the set's generic type.
		for(Integer i : ts) { 
			System.out.println(i);
		}
		
	}
}
