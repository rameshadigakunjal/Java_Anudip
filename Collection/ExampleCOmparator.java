package Collection;


import java.util.ArrayList;
import java.util.Collections; // Needed for sorting
import java.util.Comparator;

class Students {
	private String name;
	private int rollNumber;

	// CRITICAL CORRECTION: This should be a constructor (Name matches class, no return type)
	public Students(String name, int rollNumber) { 
		this.name = name;
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	@Override
	public String toString() {
		return "Students [name=" + name + ", rollNumber=" + rollNumber + "]";
	}
}

class NameComparator implements Comparator<Students> {
	// Logic is correct: Compares strings alphabetically
	@Override
	public int compare(Students s1, Students s2) {
		return s1.getName().compareTo(s2.getName());
	}
}

class RollNumberCmparator implements Comparator<Students>{

	@Override
	public int compare(Students o1, Students o2) {
		return o1.getRollNumber() - o2.getRollNumber();
		}
	
}

public class ExampleCOmparator {
	public static void main(String[] args) {
		
		// Objects s1, s2, s3 are now correctly initialized.
		Students s1 = new Students("Ramesh", 123);
		Students s2 = new Students("Rakesh", 124);
		Students s3 = new Students("Rajesh", 125);

		ArrayList<Students> al = new ArrayList<>();

		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		System.out.println("--- Original Order ---");
		System.out.println(al); // Prints: [Ramesh, Rakesh, Rajesh]
		
		// --- ADDITION: Sort the list using the custom NameComparator ---
		Collections.sort(al, new NameComparator());
		
		System.out.println("\n--- Sorted by Name ---");
		System.out.println(al); 
		Collections.sort(al, new RollNumberCmparator());
		
		for(Students s: al) {
			System.out.println(s);
		}

	}
}