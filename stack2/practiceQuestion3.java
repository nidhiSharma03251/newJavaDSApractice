import java.util.Stack;

public class practiceQuestion3 {
    public static String decodeString(String s){
        Stack<Character> stkC = new Stack<>();
        Stack<Character> stkI = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == '[' || c == Character.isLetter(c)){
                stkC.push(c);
            }
            
            if(Character.isDigit(c)){
                stkI.push(c);
            }
        }
    }
    public static void main(String args[]){
        String s = "3[b2[v]]L";

        decodeString(s);
    }
}
