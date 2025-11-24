package MyWork.String_Based_Coding;

public class TitleCase {
    public static void main(String[] args) {
        String str  = "title case must each letter should be capitlize!";
        
        String[] word  = str.split(" ");

        String result = "";
        for (String w : word) {
            result += Character.toUpperCase(w.charAt(0)) + w.substring(1) + " ";
        }
        System.out.println(result.trim());
    }
}
