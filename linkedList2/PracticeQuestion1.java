public class PracticeQuestion1 {
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

    public static Node intersect(Node head1, Node head2){
        while(head1!=null){
            Node temp=head2;
            while(temp!=null){
                if(temp==head1){
                    return head1;
                }
                temp=temp.next;
            }
            head1=head1.next;
        }
        return null;
    }
    
    public static void main(String[] args) {
        PracticeQuestion1 ll = new PracticeQuestion1();
        Node head1 = ll.new Node(1);
        Node head2 = ll.new Node(4);

        head2.next = ll.new Node(5);
        head1.next=ll.new Node(2);
        head1.next.next=ll.new Node(3);

        Node newNode = ll.new Node(6);
        head1.next.next.next = newNode;
        newNode.next=ll.new Node(7);
        head1.next.next.next.next = ll.new Node(7);
        head2.next.next = newNode;

        System.out.println(intersect(head1, head2).data);
    } 
}
