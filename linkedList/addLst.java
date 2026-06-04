package linkedList;

public class addLst{
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public Node head;
        public Node tail;

        public void add(int data){
            Node newNode = new Node(data);

            if(head==null){
                head=tail=newNode;
                return;
            }

            tail.next=newNode;
            tail = newNode;
            // tail.next=null;
        }
    public static void main(String args[]){
        addLst ll = new addLst();

        System.out.println(ll.head);
        System.out.println(ll.tail);
        ll.add(4);
        System.out.println(ll.head.data);
        System.out.println(ll.head.next);
        System.out.println(ll.tail.data);
        System.out.println(ll.head.next);
        ll.add(9);

        System.out.println(ll.head.data);
        System.out.println(ll.head.next);
        System.out.println(ll.tail.data);
        System.out.println(ll.tail.next);
    }
}