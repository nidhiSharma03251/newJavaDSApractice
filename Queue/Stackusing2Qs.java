// When push is O(n)

import java.util.ArrayDeque;
import java.util.Queue;

public class Stackusing2Qs {
    static class Stack{
        static Queue<Integer> q1 = new ArrayDeque<>();
        static Queue<Integer> q2 = new ArrayDeque<>();

        public static boolean isEmpty(){
            return q1.isEmpty();
        }

        public static void add(int data){
            while(!q1.isEmpty()){
                q2.add(q1.remove());
            }

            q1.add(data);

            while(!q2.isEmpty()){
                q1.add(q2.remove());
            }
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            return q1.remove();
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            return q1.peek();
        }

    }
    public static void main(String[] args) {
        Stack stk = new Stack();
        stk.add(1);
        stk.add(2);
        stk.add(3);
        stk.add(4);

        while(!stk.isEmpty()){
            System.out.print(stk.peek()+ " ");
            stk.remove();
        }

    }
}
