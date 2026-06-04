package linkedList;
// import linkedList.linkedListFunctions;

public class removefirst {

    public static void main(String[] args) {
        linkedListFunctions ll = new linkedListFunctions();
        ll.addFirst(5);   
        ll.addLast(3);
        ll.addinBetween(4, 1);
        ll.addFirst(15);   
        ll.addLast(13);

        ll.printLL();
        ll.deleteFirst();
        ll.printLL();
        System.out.println("Size: "+ll.size);
        ll.deleteLast();
        ll.printLL();
        System.out.println("Size: "+ll.size);

    }
}
