public class QusingLL {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
        static Node front=null;
        static Node rear=null;
        static int size;

        public static boolean isEmpty(){
            return front==null && rear==null;
        }

        public void addEnd(int data){
            Node newNode = new Node(data);

            if(front==null){
                front=rear=newNode;
                return;
            }
            rear.next=newNode;
            rear=newNode;
        }

        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int removed = front.data;
            if(rear==front){
                rear=front=null;
                return -1;
            }

            front=front.next;
            return removed;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return front.data;
        }

    public static void main(String[] args) {
        QusingLL q = new QusingLL();
        q.addEnd(3);
        q.addEnd(4);
        q.addEnd(5);
        q.addEnd(6);


        while(!q.isEmpty()){
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}
