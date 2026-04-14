public class practiceQuestion1 {

    public static void findIndex(int arr[], int n, int i,int key){
        if (i==n){
            return;
        }

        if(arr[i]==key){
            System.out.println(i);
        }
        findIndex(arr,n,i+1,key);
    }
    public static void main(String args[]){
        int arr[]={3, 2, 4, 5, 6, 2, 7, 2, 2};
        int n= arr.length;
        findIndex(arr,n,0,2);
    }
}
