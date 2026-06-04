package linkedList;

public class LLimplementation {
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    
    public static void main(String args[]){
        LLimplementation LL = new LLimplementation();
        Node n = LL.new Node(5);
        System.out.println(n.data);
        System.out.println(n.next);
    }
}
