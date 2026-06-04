package linkedList;

public class addFirst {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    public Node head;
    public Node tail;

    public void First(int data){
        Node newNode = new Node(data);

        if(head==null){
            head = tail = newNode;
            return;
        }

        newNode.next=head;
        head = newNode;
    }
    public static void main(String args[]){
        addFirst LL = new addFirst();
        LL.First(1);
        LL.First(2);
        System.out.println(LL.head.data);
        System.out.println(LL.head.next);
        System.out.println(LL.tail.data);
        System.out.println(LL.tail.next);
    }
}
