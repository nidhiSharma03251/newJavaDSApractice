import java.util.*;

public class pushBottom {
    public static void bottomPush(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        bottomPush(s, data);
        s.push(top);

    }

    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        bottomPush(s, 5);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}

// how recursion happens: the function gets called first , then it first checks
// the base case(this case runs at the end), the pop function happens and then
// the function gets called again until the base case meets, After the base case
// the code after the funcion call gets executed.
