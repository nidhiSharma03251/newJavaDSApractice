package linkedList;

public class search {
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

    public void addF(int data){
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

    public static int SearchKeyIter(int key){
        Node temp = head;

        for(int i=0; i<size; i++){
            if(temp.data == key){
                return i;
            }
            temp=temp.next;
        }
        return -1;
    }

    public static int searchKeyRecursion(int key, Node temp, int i){
        if(temp==null){
            return -1;
        }
        
        if(temp.data==key){
            return i;
        }

        return searchKeyRecursion(key, temp.next, i+1);
        
    }
    public static void main(String args[]){
        search ll = new search();
        ll.addF(2);
        ll.addF(3);
        ll.addF(4);
        ll.addF(5);
        ll.addF(6);
        ll.addF(7);

        print();
        System.out.println(ll.SearchKeyIter(52));
        System.out.println(searchKeyRecursion(4,head,0));
    }
}
