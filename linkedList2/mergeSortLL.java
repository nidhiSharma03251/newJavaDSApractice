import java.util.LinkedList;

// import org.w3c.dom.Node;

public class mergeSortLL {

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

    public static Node FindMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast.next!=null && fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }

    public static Node merge(Node newleft, Node newRight){
        Node mergedLL=new Node(0);
        Node temp = mergedLL;
        while(newleft!=null && newRight!=null){
            if(newleft.data<=newRight.data){
                temp.next=newleft;
                newleft=newleft.next;
                temp=temp.next;
            }else if(newleft.data>newRight.data){
                temp.next=newRight;
                newRight=newRight.next;
                temp=temp.next;
            }
        }

        while(newleft!=null){
            temp.next=newleft;
            newleft=newleft.next;
            temp=temp.next;
        }
        while(newRight!=null){
            temp.next=newRight;
            newRight=newRight.next;
            temp=temp.next;
        }

        return mergedLL.next;
    }

    public static Node MergeSort(Node head){

        if(head==null || head.next==null){
            return head;
        }
        //find mid
        Node mid = FindMid(head);

        //divide
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft=MergeSort(head);
        Node newRight=MergeSort(rightHead);
        
        return merge(newLeft,newRight);    
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
        mergeSortLL ll = new mergeSortLL();
        ll.addFirst(9);
        ll.addFirst(11);
        ll.addFirst(1);
        ll.addFirst(10);
        ll.addFirst(89);
        ll.addFirst(0);


        printLL(head);
        Node head = ll.MergeSort(ll.head);
        printLL(head);
    }
}
