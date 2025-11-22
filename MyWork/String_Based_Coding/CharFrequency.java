package MyWork.String_Based_Coding;

import java.util.Map;
//4. Find the frequency of each character in a string
public class CharFrequency {
    public static void main(String[] args) {
        String s = "twobanana";
        Map<Character, Integer> map = new java.util.HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println(map );

    }
}
