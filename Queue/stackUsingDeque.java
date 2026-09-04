import java.util.*;
public class stackUsingDeque {
    static class Stack{
        Deque<Integer> deque = new ArrayDeque<>();

        public void push(int data){
            deque.addLast(data);
        }

        public int pop(){
            return deque.removeLast();
        }

        public int peek(){
            return deque.getLast();
        }

        public Deque<Integer> printStk(){
            return deque;
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(2);
        s.push(3);
        s.push(3);
        s.push(4);

        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.printStk());
    }
}
