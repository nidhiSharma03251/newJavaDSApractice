import java.util.Stack;

public class reverseString {
    public static void main(String[] args) {
        String s = "abcd";
        Stack<Character> stk = new Stack<>();

        int i=0;
        while(i < s.length()){
            char c = s.charAt(i);
            stk.push(c);
            i++;
        }

        StringBuilder reversed = new StringBuilder();
        while(!stk.isEmpty()){
            char r= stk.pop();
            reversed.append(r);
        }

        System.out.println(s);
        System.out.println("After reversing: " + reversed.toString());
    }
}
