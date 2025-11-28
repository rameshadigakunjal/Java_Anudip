package MyWork.String_Based_Coding;
import java.util.*;
//12. Most Frequent Character in a String
public class MostFrequentChar {
    public static void main(String[] args) {
        String str = "sucessessfully";
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        char maxChar = ' ';
        int maxCount = 0;

        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            if (e.getValue() > maxCount) {
                maxCount = e.getValue();
                maxChar = e.getKey();
            }
        }

        System.out.println("Most frequent char: " + maxChar);
        System.out.println("Frequency: " + maxCount);
    }
}
