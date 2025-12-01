package Lab_Program.Lab_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Data");
        list.add("Science");

        System.out.println("Original List: " + list);

        Collections.reverse(list);

        System.out.println("Reversed List: " + list);
	}
}

