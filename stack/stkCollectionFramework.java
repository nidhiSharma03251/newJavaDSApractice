import java.util.*;
public class stkCollectionFramework {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(4);
        s.push(14);
        s.push(44);
        s.push(404);
        s.push(41);

        s.pop();

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
}