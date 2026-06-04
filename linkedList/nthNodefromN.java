package linkedList;

public class nthNodefromN {
    public static class Node{
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

        if(head==null){
            head = tail = newNode;
            size++;
            return;
        }

        newNode.next=head;
        head = newNode;
        size++;
    }

    public static void removeNthfromEnd(int n){
        Node temp = head;
        if(size==n){
            head=tail=null;
            return;
        }

        int m = size-n;
        int i=1;
        while(i<m){
            temp=temp.next;
            i++;
        }

        temp.next=temp.next.next;
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
        nthNodefromN LL = new nthNodefromN();
        LL.First(1);
        LL.First(2);
        LL.First(3);
        LL.First(4);
        LL.First(5);
        LL.First(6);
        print();
        removeNthfromEnd(4);
        print();
    }
}
