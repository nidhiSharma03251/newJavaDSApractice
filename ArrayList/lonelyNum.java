import java.util.*;

public class lonelyNum {
    public static ArrayList<Integer> lonely(ArrayList<Integer> arrL){
        Integer[] nums = arrL.toArray(new Integer[0]);
        Arrays.sort(nums);
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            boolean isLonely = true;
            if(i<nums.length-1 && (nums[i]==nums[i+1] || nums[i]+1== nums[i+1])){
                isLonely = false;
            }
            if(i>0 && (nums[i]==nums[i-1] || nums[i-1]==nums[i]-1)){
                isLonely = false;
            }
            if(isLonely){
                result.add(nums[i]);
            }
        }

        return result;
    }
    public static void main(String args[]){
        ArrayList<Integer> arrL = new ArrayList<>();
        arrL.add(1); 
        arrL.add(3); 
        arrL.add(5); 
        arrL.add(3); 
        System.out.println(lonely(arrL));
    }
}
