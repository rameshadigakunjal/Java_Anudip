package MyWork.String_Based_Coding;

public class LargestWord {

    public static void main(String[] args) {
    //     String str = "Java is a programming language";
    //     String[] words = str.split(" ");

    //     String largestWord = "";
    //     for(String word : words){
    //         if(word.length() > largestWord.length()){
    //             largestWord = word;
    //         }
    //     }

    //     System.out.println("The largest word is: " + largestWord);
    // }
    String s = "Programming language is java, python, c, c++, Go";
	String[] words = s.split(" ");

	String largest  = "";
	
	for(String w : words){
		if(w.length()>largest.length()){
			 largest = w;
		}
	}
	System.out.println("largest word is: "+largest);	

    }
    
}
