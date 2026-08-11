import java.util.*;

public class validParenthesis{
    public static void main(String[] args) {
        String str = "({})[]))";
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);

            if(c == '(' || c == '{' || c == '['){
                s.push(c);
            }
            else{
                if(s.isEmpty()){
                    System.out.println("Invalid parenthesis");
                    return ;
                }
                if((s.peek() == '(' && c==')') || (s.peek() == '{' && c=='}') || (s.peek() == '[' && c==']')){
                    s.pop();
                }else{
                    System.out.println("Invalid parenthesis");
                    return ;
                }
            }
        }

        if(s.isEmpty()){
            System.out.println("Valid Parenthesis");
        }else{
            System.out.println("Invalid Parenthesis");
        }
    }
}