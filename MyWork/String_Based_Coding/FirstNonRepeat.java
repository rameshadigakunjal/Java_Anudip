package MyWork.String_Based_Coding;

import java.util.*;
import java.util.Map.Entry;

public class FirstNonRepeat {
    public static void main(String[] args) {
        String s = "swiss";
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : s.toCharArray())
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        for (Entry<Character, Integer> x : map.entrySet()) {
            if (x.getValue() == 1) {
                System.out.println("First non-repeating: " + x.getKey());
                break;
            }
        }
    }
}

