import java.util.Stack;

public class nextGreater {
    public static void main(String[] args) {
        int arr[] = {10, 4, 6, 3, 8, 2, 7, 1};
        int greaterEls[] = new int[arr.length];

        Stack<Integer> s = new Stack<>();

        for(int i=arr.length-1; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()] < arr[i]){
                s.pop();
            }

            if(s.isEmpty()){
                greaterEls[i] = -1;
            }else{
                greaterEls[i] = arr[s.peek()];
            }

            s.push(i);
        }

        for(int i=0; i<greaterEls.length; i++){
            System.out.print(greaterEls[i] + " ");
        }
    }
}
