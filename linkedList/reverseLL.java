package linkedList;

public class reverseLL {
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            size++;
            return;
        }

        newNode.next = head;
        head=newNode;
        size++;
    }

    public void print(){
        if(head==null){
            System.out.println("The ll is empty");
            return;
        }

        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public void reverse(){
        Node prev = null;
        Node curr=head;
        tail=head;
        while(curr!=null){
            Node next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        System.out.println(head.data);
        System.out.println(tail.data);
    }

    public static void main(String[] args) {
        reverseLL ll = new reverseLL();
        ll.addFirst(1);
        ll.addFirst(12);
        ll.addFirst(31);
        ll.addFirst(51);
        ll.addFirst(10);
        ll.addFirst(90);

        System.out.println(ll.size);

        ll.print();
        ll.reverse();
        ll.print();

    }
}
