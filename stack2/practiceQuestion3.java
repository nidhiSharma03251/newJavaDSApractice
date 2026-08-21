import java.util.Stack;

public class practiceQuestion3 {
    public static String DecodeString(String s){
        Stack<Integer> numStk = new Stack<>();
        Stack<String> StrStk = new Stack<>();
        int number=0;
        String current = "";

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if(Character.isDigit(c)){
                number = number * 10 + (c-'0');
            }else if(c == '['){
                numStk.push(number);
                StrStk.push(current);

                number=0;
                current="";
            }else if(c == ']'){
                int repeat = numStk.pop();
                String prev = StrStk.pop();

                String temp="";
                for(int j=0; j<repeat; j++){
                    temp += current;
                }
                current = prev+temp;
            }else{
                current += c;
            }
        }
        return current;

    }
    public static void main(String args[]){
        String s = "3[b2[v]]L";

        System.out.println(DecodeString(s));
    }
}
