package MyWork.String_Based_Coding;

public class CountVowels {
    public static void main(String[] args) {
        String str = "ProgrammingLanguage";
        str = str.toLowerCase();

        int v = 0, c = 0;

        for(char ch : str.toCharArray()){
            if("aeiou".indexOf(ch) != -1){
                v++;            
            }
            else if(ch>= 'a' && ch<= 'z'){
                c++;
            }

        }
        System.out.println("Number of Vowels: " + v);
        System.out.println("Number of Consonants: " + c);
    }
    
}
