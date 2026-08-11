public class stackusingLL {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    static class Stack{
        static Node head = null;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {
            Node newNode = new Node(data);
            
            if(isEmpty()){
                head=newNode;
                return;
            }

            newNode.next=head;
            head=newNode;
        }

        public static int pop(){
            if(isEmpty()){
                return -1;
            }

            Node temp = head;
            head=head.next;
            temp.next=null;
            return temp.data;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(11);
        s.push(12);
        s.push(13);
        s.pop();

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
}
