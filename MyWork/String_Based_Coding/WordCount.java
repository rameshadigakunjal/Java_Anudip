package MyWork.String_Based_Coding;

public class WordCount {
    public static void main(String[] args) {
        String s = "abc def ghi jkl mno pqr stu vwx yz";
        String[] words = s.split("\\s+");

        System.out.println("Total number of words: " + words.length);
    }
    
}
