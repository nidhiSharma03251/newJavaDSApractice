import java.util.ArrayList;

public class pairSum1 {

    public static boolean pairSum(ArrayList<Integer> arrL, int target){
        int lp = 0;
        int rp = arrL.size()-1;
        while(lp<rp){
            if(arrL.get(lp) + arrL.get(rp) == target){
                return true;
            }else if(arrL.get(lp) + arrL.get(rp) < target){
                lp++;
            }else{
                rp--;
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> arrL = new ArrayList<>();
        arrL.add(0);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);
        arrL.add(5);

        System.out.println(pairSum(arrL, 10));
    }
}
