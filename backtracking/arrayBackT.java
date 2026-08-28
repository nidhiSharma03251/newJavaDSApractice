public class arrayBackT {

    public static void updateArr(int arr[], int i, int val){
        if(i==arr.length){
            return;
        }
        arr[i]=val;
        updateArr(arr, i+1, val+1);
        arr[i]=arr[i]-2;


    }
    public static void main(String args[]){
        int arr[] = new int[5];

        updateArr(arr,0,2);
        
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
