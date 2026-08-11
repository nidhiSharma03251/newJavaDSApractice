public class practiceQ5 {
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

    public class MergeKList{
        Node merge(Node a, Node b){
            if(a==null){
                return b;
            }
            if(b==null){
                return a;
            }
            Node result;
            if(a.data <= b.data){
                result = a;
                result.next = merge(a.next, b);
            }else{
                result = b;
                result.next = merge(a, b.next);
            }
            return result;
        }
        Node mergeKList(Node arr[], int k){
            Node result = arr[0];

            for(int i=1; i<k; i++){
                result = merge(result, arr[i]);
            }
            return result;
        }
    }

    public static void main(String[] args) {
        practiceQ5 ll = new practiceQ5();
        MergeKList mergeKList = ll.new MergeKList();
        
        Node head1 = new Node(2);
        head1.next = new Node(7);

        Node head2 = new Node(3);
        head2.next = new Node(6);

        Node head3 = new Node(11);
        head3.next = new Node(15);

        Node arr[] = new Node[3];
        arr[0]=head1;
        arr[1]=head2;
        arr[2]=head3;

        Node result = mergeKList.mergeKList(arr, 3);

        while(result!=null){
            System.out.print(result.data + "->");
            result=result.next;
        }
        System.out.println("null");

    }
}

