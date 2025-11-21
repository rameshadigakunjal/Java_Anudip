package MyWork.String_Based_Coding;

//1️. Reverse a String
public class ReverseString {

    public static void main(String[] args) {
        String str = "bestcodingLanguage";
        String rev = " ";
        for(int i = str.length()-1; i>=0; i--){
            rev += str.charAt(i);
        }
        System.out.println(rev);
    }
    
}
