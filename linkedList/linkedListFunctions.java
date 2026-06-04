package linkedList;

public class linkedListFunctions {
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public Node head;
    public Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;

        if(head==null){
            head = tail = newNode;
            return;
        }

        newNode.next=head;
        head=newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;

        if(head==null){
            head=tail=newNode;
            return;
        }

        tail.next=newNode;
        tail=newNode;
    }

    public void addinBetween(int data, int index){
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;

        if(head==null){
            addFirst(data);
            return;
        }

        while(i<index-1){
            temp=temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next=newNode;
    }

    public void printLL(){
        if(head==null){
            System.out.println("The linked list is empty");
            return;
        }

        Node temp = head;
        
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public void deleteFirst(){
        if(size==0){
            System.out.println("The ll is empty");
            return;
        }
        
        if(size==1){
            System.out.println("The deleted node is "+ head.data);
            head=tail=null;
            size--;
            return;
        }
    
        System.out.println("The deleted node is "+ head.data);
        size--;
        head = head.next;
    } 

    public void deleteLast(){
        if(size==0){
            System.out.println("The linked list is empty");
            return ;
        }else if(size==1){
            int val =head.data;
            head=tail=null;
            size--;
            System.out.println("The deleted value is "+ val);
            return;
        }

        Node temp = head;
        // int i=0;
        while(temp.next.next!=null){  //while(i<size-2){i++; same}
            temp=temp.next;
        }
        int val = temp.next.data;
        temp.next=null;
        tail=temp;
        size--;
        System.out.println("The deleted value is "+ val);
    }

    public static void main(String args[]){
        linkedListFunctions LL = new linkedListFunctions();        
        System.out.println(size);
    }
}

