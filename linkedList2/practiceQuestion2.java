public class practiceQuestion2 {
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

    public static void DeleteMnodes(int m, int n, Node head){
        if(head==null)return;
        Node temp= head;

        System.out.println("List after deletion");
        while(temp!=null){
            for(int i=1; i<m && temp!=null; i++){
                temp=temp.next;
            }

            if(temp==null)return;

            Node t = temp.next;
            for(int i=1; i<=n && t!=null; i++){
                t=t.next;
            }

            temp.next=t;
            temp=t;
        }
    }

    public static void printLL(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void main(String[] args) {
        // practiceQuestion2 ll = new practiceQuestion2();

        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next= new Node(5);
        head.next.next.next.next.next=new Node(6);
        head.next.next.next.next.next.next=new Node(7);
        head.next.next.next.next.next.next.next=new Node(8);
        printLL(head);

        DeleteMnodes(3,2,head);
        printLL(head);
    }
}
