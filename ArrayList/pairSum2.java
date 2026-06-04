import java.util.ArrayList;

public class pairSum2 {
    public static boolean pairSum(ArrayList<Integer> arrL, int target){
        int n= arrL.size();
        int bp=-1;
        for(int i=0; i<n; i++){
            if(arrL.get(i) > arrL.get(i+1)){
                bp=i;
                break;
            }
        }
        int rp = bp;
        int lp = bp+1;

        while(lp!=rp){
            if(arrL.get(lp)+arrL.get(rp) == target){
                return true;
            }
            if(arrL.get(lp)+arrL.get(rp) < target){
                lp = (lp+1)%n;
            }else{
                rp = (n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> arrL = new ArrayList<>();
        arrL.add(11);
        arrL.add(15);
        arrL.add(6);
        arrL.add(8);
        arrL.add(9);
        arrL.add(10);

        System.out.println(pairSum(arrL, 26));
    }
}
