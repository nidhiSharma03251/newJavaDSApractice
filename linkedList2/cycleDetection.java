package linkedList2;
public class cycleDetection {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    } 
    public static Node head;
    public static Node tail;

    public static boolean isCycle(Node head){ //floyd's cycle finding algorithm
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String args[]){
        // cycleDetection ll =new cycleDetection();
        Node head = new Node(2);
        head.next=  new Node(3);
        head.next.next=new Node(4);
        head.next.next.next=new Node(5);
        head.next.next.next=head.next;

        System.out.println(isCycle(head));
    }
}
