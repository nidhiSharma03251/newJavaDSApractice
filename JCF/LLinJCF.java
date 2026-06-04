package JCF;
import java.util.LinkedList;

public class LLinJCF {
    public static void main(String[] args) {
        LinkedList<Integer> ll =new LinkedList<>();
        ll.addFirst(2);
        ll.addLast(3);
        ll.addFirst(1);
        System.out.println(ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
}
