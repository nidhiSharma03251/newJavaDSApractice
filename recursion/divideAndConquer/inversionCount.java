public class inversionCount {

    public static int merge(int arr[], int si,int mid, int ei){
        int temp[]= new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        int count =0;

        while(i<=mid && j<=ei){
            if(arr[i]>arr[j]){
                count = count + (mid-i+1);
                temp[k++]=arr[j++];
            }else{
                temp[k++]=arr[i++];
            }
        }

        while(i<=mid){
            temp[k++]=arr[i++];
        } 
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        for(k=0, i=si; k<temp.length; k++, i++){
            arr[i]=temp[k];
        }

        return count;

    }
    public static int mergeSort(int arr[], int si, int ei){
        if(si>=ei){
            return 0;
        }

        int mid = si + (ei-si)/2;
        int leftCount = mergeSort(arr, si, mid);
        int rightCount = mergeSort(arr, mid+1, ei);
        int mergeCount = merge(arr, si,mid,ei);

        return leftCount+rightCount+mergeCount;
    }
    public static void main(String args[]){
        int arr[]={2,4,1,3,5};
        int n=arr.length;
        System.out.println(mergeSort(arr, 0, n-1));
    }
}
