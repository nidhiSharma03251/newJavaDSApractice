package JCF;
import java.util.LinkedList;

public class mergeSortLL {
    public static void mergeSort(LinkedList<Integer> ll, int l, int r){
        if(l>=r){
            return;
        }
        int mid = (r-l)/2;
        mergeSort(ll, l,mid);
        mergeSort(ll, mid+1, r);

        merge(ll,l,mid,r);

    }

    public static void merge(LinkedList<Integer> ll, int l, int mid, int r){
        int i=l;
        int j=mid+1;

        LinkedList<Integer> temp = new LinkedList<>();

        while(i<=mid && j<=r){
            if(ll.get(i) < ll.get(j)){
                temp.add(ll.get(i));
                i++;
            }else{
                temp.add(ll.get(j));
                j++;
            }
        }

        while(i<=mid){
            temp.add(ll.get(i));
        }
        while(j<=r){
            temp.add(ll.get(j));
        }

        for(int m=0; m<ll.size(); m++){
            ll.add(temp.get(i));
        }
    }
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(5);
        ll.add(2);
        ll.add(9);
        ll.add(10);
        ll.add(7);
        ll.add(6);
        ll.add(14);
        System.out.println(ll);
        mergeSort(ll,0,8);
        System.out.println(ll);

    }
}
