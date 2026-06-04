package linkedList;

public class addInBetween {
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
    public static int size;

    public void First(int data){
        Node newNode = new Node(data);
        size++;

        if(head==null){
            head = tail = newNode;
            return;
        }

        newNode.next=head;
        head = newNode;
    }

    public void addBetween(int data, int index){
        if(index==0){
            First(data);
            return;
        }

        Node temp = head;
        int i=0;
        while(i < index-1){
            i++;
            temp = temp.next;
        }

        Node newNode = new Node(data);
        size++;
        newNode.next= temp.next;
        temp.next=newNode;
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
        addInBetween ll = new addInBetween();

        ll.First(2);
        ll.First(3);
        ll.First(4);
        ll.First(5);
        ll.First(6);

        ll.addBetween(1, 4);
        System.out.println(ll.size);

        print();
    }
}
