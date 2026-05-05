public class majorityElement {

    public static int majorityEl(int arr[], int n){
        int count=0;
        int majority=arr[0];
        int i=0;
        while(i<=n){
            if(count==0){
                majority=arr[i];
            }
            if(arr[i]==majority){
                count++;
            }else{
                count--;
            }
            i++;
        }
        return majority;
    }
    public static void main(String args[]){
        int arr[]={2,2,1,1,1,1,2,2,1};
        int n=arr.length;
        System.out.println(majorityEl(arr,n-1));
    }
}
