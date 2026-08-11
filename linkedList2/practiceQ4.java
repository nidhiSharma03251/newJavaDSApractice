public class practiceQ4 {
    static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    public static Node head;
    public static Node tail;

    public static void addNode(int data){
        Node newNode = new Node(data);

        if(head==null){
            head=tail=newNode;
            return;
        }

        tail.next=newNode;
        tail=newNode;
    }

    public static void evenOddLL(Node head){
        Node evenStart = null;
        Node evenEnd = null;
        Node oddStart = null;
        Node oddEnd = null;

        Node curr=head;
        while(curr!=null){
            Node next = curr.next;
            curr.next=null;

            if(curr.data%2 == 0){
                if(evenStart==null){
                    evenStart=evenEnd=curr;
                }else{
                    evenEnd.next=curr;
                    evenEnd=curr;
                }
            }else{
                if(oddStart==null){
                    oddStart=oddEnd=curr;
                }else{
                    oddEnd.next=curr;
                    oddEnd=curr;
                }
            }
            curr=next;
        }
        if(evenStart==null){
            head=oddStart;
            return;
        }

        if(oddStart==null){
            head=evenStart;
            return;
        }

        evenEnd.next=oddStart;
        head=evenStart;
    }

    public static void printLL(Node head){
        if(head==null){
            return;
        }

        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ "->");
            temp=temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        practiceQ4 ll = new practiceQ4();
        ll.addNode(8);
        ll.addNode(12);
        ll.addNode(10);
        ll.addNode(5);
        ll.addNode(4);
        ll.addNode(1);
        ll.addNode(6);

        printLL(head);
        System.out.println();
        evenOddLL(head);
        printLL(head);
    }
}
