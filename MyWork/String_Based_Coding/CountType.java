package MyWork.String_Based_Coding;
//11. Count Letters, Digits, and Special Characters in a String
public class CountType {
    public static void main(String[] args) {
        String str  = "java123@2025";
        int letterCount = 0, digitCount = 0, specialCharCount = 0;

        for(char ch : str.toCharArray()) {
            if(Character.isLetter(ch)) {
                letterCount++;
            } else if(Character.isDigit(ch)) {
                digitCount++;
            } else {
                specialCharCount++;
            }
            
        }
        System.out.println("Letters: " + letterCount);
        System.out.println("Digits: " + digitCount);
        System.out.println("Special Characters: " + specialCharCount);
    }
}
