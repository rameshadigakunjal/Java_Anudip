package MyWork.String_Based_Coding;
//2. Palindrome String
public class PalindromeString {
    public static void main(String[] args) {
        String str = "malayalam";
        String rev = "";
        for(int i = str.length()-1; i>=0; i--){
            rev += str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println(str + " is a Palindrome String");
        } else {
            System.out.println(str + " is not a Palindrome String");
        }
    }
    
}
