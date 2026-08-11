public class doublyLL {
    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

    public static Node head;
    public static Node tail;

    public void printDll(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + "<->");
            temp=temp.next;
        }
        System.out.println("null");
    }

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

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
        }

        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }

        temp.next=newNode;
        newNode.prev=temp.next;
        tail=newNode;
    }

    public void removeLast(){
        if(head==null){
            System.out.println("The list is empty.");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }

        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }

        Node secondLast = temp.prev;
        secondLast.next = null;
        // temp=null;
    }

    public void removeFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.next==null){
            head=tail=null;
            return;
        }

        head = head.next;
        head.prev=null;
    }

    public static void main(String[] args) {
        doublyLL dll = new doublyLL();
        dll.addFirst(2);
        dll.addFirst(3);
        dll.addFirst(4);

        dll.printDll();
        dll.removeLast();
        dll.printDll();
        dll.removeFirst();
        dll.printDll();
        dll.addLast(25);
        dll.printDll();
    }
}
