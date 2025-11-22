package MyWork.String_Based_Coding;
//5. Remove Duplicates from a String
public class RemoveDublicates {
    public static void main(String[] args) {
        String str = "programming";
        String result = "";
        
        for(char ch : str.toCharArray()){
            if(result.indexOf(ch)== -1)
                result += ch;
        }
        System.out.println(result);
    }
}
