public class reverseDLL {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=prev;
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
        head.prev=newNode;
        head=newNode;
    }

    public void printDll(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + "<->");
            temp=temp.next;
        }
        System.out.println("null");
    }


    public Node reverseLL(){
        Node prev=null;
        Node curr=head;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
        return prev;
    }

    public static void main(String[] args) {
        reverseDLL dll = new reverseDLL();
        dll.addFirst(2);
        dll.addFirst(3);

        dll.addFirst(4);
        dll.addFirst(5);
        dll.addFirst(6);
        dll.addFirst(7);
        dll.printDll();
        dll.reverseLL();
        dll.printDll();
    }
}
