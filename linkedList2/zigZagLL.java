// import org.w3c.dom.Node;

public class zigZagLL {
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

    public static void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }

        newNode.next=head;
        head=newNode;
    }

    public static Node findMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static void add(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }

        tail.next=newNode;
        tail=newNode;
    }

    public static Node reverseRightHalf(Node mid){
        Node prev=null;
        Node curr=mid.next;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        return prev;
    }

    public static void ZigZag(Node head){
        //find mid
        Node mid = findMid(head);
        //reverse right half
        Node rightHead = reverseRightHalf(mid);
        // ll.printLL(head);
        mid.next=null;
        Node leftHead = head;
        //concat zigZag
        while(leftHead!=null && rightHead!=null){
            Node nextL=leftHead.next;
            Node nextR=rightHead.next;

            leftHead.next=rightHead;
            rightHead.next=nextL;
            // nextL.next=nextR;

            leftHead=nextL;
            rightHead=nextR;
        }
    }

    public static void printLL(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        zigZagLL ll = new zigZagLL();
        ll.addFirst(2);
        ll.add(8);
        ll.add(7);
        ll.add(6);
        ll.add(5);
        ll.add(4);
        ll.addFirst(3);
        ll.addFirst(2);

        ll.printLL(head);
        ZigZag(head);
        ll.printLL(head);

    }
}
