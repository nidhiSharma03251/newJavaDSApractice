public class circularSinglyLL {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
        }
    }

    public Node head;
    public Node last;

    public Node addFirst(Node last, int data){
        Node newNode = new Node(data);

        if(last == null){
            addToEmpty(last, data);
            return last;
        }

        newNode.next = head;
        head=newNode;
        last.next=head;

        return last;
    }

    public Node addToEmpty(Node last, int data){
        Node newNode = new Node(data);

        head=last=newNode;
        last.next=head;
        return last;
    }

    public void printDll(){
        Node temp=head;
        do{
            System.out.print(temp.data + "->");
            temp=temp.next;
        }while(temp!=head);
        System.out.println("Back to head");
    }

    public Node addToEnd(Node last, int data){
        Node newNode = new Node(data);
        if(head==null){
            head=last=newNode;
            last.next=head;
            return last;
        }

        newNode.next=head;
        last.next=newNode;
        last=newNode;

        return last;
    }

    public Node addAfter(Node last, int data, int key){
        Node newNode = new Node(data);

        if(last==null){
            System.out.println("List is empty");
            return null;
        }

        Node temp=head;
        do{
            if(temp.data==key){
                newNode.next=temp.next;
                temp.next=newNode;
                if(temp==last){
                    return newNode;
                }
            return last;
            }
            temp=temp.next;
        }while(temp!=head);

        System.out.println("The key is not found.");
        return last;
    }

    public Node deleteNode(int key, Node last){
        if(last==null){
            System.out.println("List is empty");
            return null;
        }

        Node temp=last.next;
        Node prev=last;

        do{
            if(temp.data==key){
                if(temp == last && temp.next==temp){
                    return null;
                }
                if(temp==last.next){
                    last.next=temp.next;
                }
                if(temp==last){
                    last=prev;
                }

                prev.next=temp.next;
                return last;
            }
            prev=temp;
            temp=temp.next;
        }while(temp!=last.next);

        System.out.println("Key not found");
        return last;
    }

    public static void main(String[] args) {
        circularSinglyLL cDll = new circularSinglyLL();

        Node last=null;
        last=cDll.addToEmpty(last,25);
        last = cDll.addFirst(last,1);
        last = cDll.addFirst(last,2);
        last = cDll.addFirst(last,3);
        last = cDll.addFirst(last,4);
        last = cDll.addFirst(last,5);
        cDll.printDll();

        System.out.println("Head: " + cDll.head.data);
        System.out.println("Head from last: " + last.next.data);

        last = cDll.addToEnd(last, 11);
        cDll.printDll();
        System.out.println("Head: " + cDll.head.data);
        System.out.println("Head from last: " + last.next.data);

        last = cDll.addFirst(last, 99);
        cDll.printDll();
        System.out.println("Head: " + cDll.head.data);
        System.out.println("Head from last: " + last.next.data);

        last = cDll.addAfter(last, 17, 3);
        last = cDll.addAfter(last, 16, 100);
        last = cDll.addAfter(last, 16, 11);
        cDll.printDll();
        System.out.println("Head: " + cDll.head.data);
        System.out.println("Head from last: " + last.next.data);

        last=cDll.deleteNode(3,last);
        last=cDll.deleteNode(16,last);
        cDll.printDll();
    }
}
