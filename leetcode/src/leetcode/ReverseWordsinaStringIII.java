package leetcode;

public class ReverseWordsinaStringIII {
	public String reverseWords(String s) {
        String result = "";
        String[] splittedWords = s.split(" ");
        for(int i=0; i < splittedWords.length; i++){
            StringBuilder sB = new StringBuilder();
            sB.append(splittedWords[i]);
            sB.reverse();
            result += sB;
            if(i != splittedWords.length - 1){
                result += " ";
            }
        }
        
        return result;
    }
}
