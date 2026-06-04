package linkedList;

public class printLL {
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

    public void addFirst(int data){
        Node newNode = new Node(data);

        if(head==null){
            head=tail=newNode;
            return;
        }

        newNode.next=head;
        head=newNode;
    }

    public static void print(){
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp =temp.next;
        }
        System.out.println();
    }
    public static void main(String args[]){

        printLL ll = new printLL();

        print();

        ll.addFirst(2);
        print();

        ll.addFirst(3);
        print();

        ll.addFirst(4);
        print();

        ll.addFirst(5);
        print();

        ll.addFirst(6);

        print();

    }
}
