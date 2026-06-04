import org.w3c.dom.Node;

public class removeCycle {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void detectCycleAndRemove(Node head){
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }
        }
        
        if(cycle){
            slow=head;
            Node prev=null;
            while(slow!=fast){
                slow=slow.next;
                prev=fast;
                fast=fast.next;
            }

            prev.next=null;
        }else{
            System.out.println("No cycle exist.");
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

    public static void main(String args[]){
        removeCycle ll =new removeCycle();
        Node head = new Node(3);
        head.next=new Node(4);
        head.next.next = new Node(5);
        head.next.next.next = new Node(6);
        head.next.next.next.next = new Node(7);
        head.next.next.next.next.next = head.next;  //3->4->5->6->7->3
        // printLL(head);

        detectCycleAndRemove(head);
        detectCycleAndRemove(head);
        printLL(head);
    }

}
 