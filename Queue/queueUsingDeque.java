import java.util.ArrayDeque;
import java.util.Deque;

public class queueUsingDeque {
    static class Queue{
        Deque<Integer> deque = new ArrayDeque<>();
        
        public void add(int data){
            deque.addLast(data);
        }

        public int remove(){
            return deque.removeFirst();
        }

        public int peek(){
            return deque.peekFirst();
        }

        public Deque<Integer> printQueue(){
            return deque;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println(q.remove());
        System.out.println(q.peek());
        System.out.println(q.printQueue());

    }
}
