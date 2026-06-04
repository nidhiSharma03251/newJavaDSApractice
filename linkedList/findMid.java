package linkedList;

public class findMid {
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=next;
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

        newNode.next=head;
        head=newNode;
        size++;
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

    public static Node findMidNode(){
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static Node reverse(Node mid){
        Node prev = null;
        Node curr = mid;
        Node next;
        // tail=null;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        return right;
    }

    public static boolean palindrome(){
        if(head==null || head.next==null){
            return true;
        }

        //find mid
        Node midNode = findMidNode();

        //reverse 2nd half
        Node right = reverse(midNode);
        Node left=head;

        //check 1st and 2nd half are palindrome or not
        
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        findMid ll =new findMid();

        ll.addFirst(1);
        ll.addFirst(2);
        // ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(1);

        if(palindrome()){
            System.out.println("the list is palindrome.");
        }else{
            System.out.println("the list is not palindrome.");
        }
    }
}
