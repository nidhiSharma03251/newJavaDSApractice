import java.util.Stack;

public class duplicateParenthesis {
    public static boolean checkDuplicate(String str){
        Stack<Character> stk = new Stack<>();
        
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch=='('){
                stk.push(ch);
            }
            if(ch==')'){
                int count=0;
                while(stk.peek() != '('){
                    stk.pop();
                    count++;
                }
                if(count < 1){
                    return true;
                }else{
                    stk.pop();
                    
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "((((a+(b)))+(c+d)))";

        if(checkDuplicate(str)){
            System.out.println("The string has duplicate parenthesis");
        }else{
            System.out.println("No duplicate parenthesis");
        }
    }
}
