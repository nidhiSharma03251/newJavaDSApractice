public class swapNodesQ3 {
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

    public static void pushNode(int data){
        Node newNode = new Node(data); 
        if(head==null){
            head=tail=newNode;
            return;
        }

        tail.next=newNode;
        newNode.next = null;
        tail=newNode;
    }

    public static void swapNodes(Node head, int x, int y){
            Node currX=head;
            Node prevX=null;
            while(currX!=null && currX.data!=x){
                prevX = currX;
                currX=currX.next;
            }

            Node currY=head;
            Node prevY=null;
            while(currY!=null && currY.data!=y){
                prevY = currY;
                currY = currY.next;
            }

            if(currX == null || currY == null){
                return;
            }

            if(prevX!=null){
                prevX.next=currY;
            }else{
                head=currY;
            }
            if(prevY!=null){
                prevY.next=currX;
            }else{
                head=currX;
            }

            Node temp = currX.next;
            currX.next=currY.next;
            currY.next=temp;
    }

    public static void printLL(Node head){
        if(head==null){
            return;
        }
        Node tN = head;
        while(tN!=null){
            System.out.print(tN.data + "->");
            tN=tN.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        swapNodesQ3 llist = new swapNodesQ3();
        llist.pushNode(1);
        llist.pushNode(2);
        llist.pushNode(3);
        llist.pushNode(4);

        printLL(head);
        System.out.println();
        swapNodes(head, 2, 4);
        System.out.println();
        printLL(head);
    }
}
