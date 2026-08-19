import java.util.Stack;

public class practiceQuestion1 {
    class Node{
        char data;
        Node next;

        public Node(char data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;


    public void addNode(char data){
        Node newNode = new Node(data);

        if(head==null){
            head=tail=newNode;
            return;
        }

        tail.next=newNode;
        tail=newNode;
    }

    public static boolean checkPalindromeUsingStack(Node head){
        Stack<Character> s = new Stack<>();
        Node temp=head;

        while(temp!=null){
            s.push(temp.data);
            temp=temp.next;
        }
        temp=head;

        while(temp!=null){
            if(temp.data != s.pop()){
                return false;
            }
            temp=temp.next;
        }
        
        return true;
    }
    public static void main(String args[]){
        practiceQuestion1 ll = new practiceQuestion1();
        ll.addNode('A');
        ll.addNode('B');
        ll.addNode('C');
        ll.addNode('B');
        ll.addNode('A');

        if(checkPalindromeUsingStack(head)){
            System.out.println("Yes its palindrome");
        }else{
            System.out.println("No its not palindrome");
        }
    }
}
