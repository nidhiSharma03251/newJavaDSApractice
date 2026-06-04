// Most Frequent Number following Key(EASY)YouaregivenanintegerArraylistnums.Youarealsogivenanintegerkey,whichispresentinnums.Foreveryuniqueintegertargetinnums,countthenumberoftimestargetimmediatelyfollowsan occurrence of key in nums. In other words, count the number of indices i such that:0 <= i <= nums.size() - 2,nums.get(i) == key and,nums.get(i+1) == target.Return the target with the maximum count.(Assumption- that the target with maximum count isunique.)

import java.util.ArrayList;
import java.util.Collections;

public class mostFreq {
    public static int mostFrequentAfterKey(ArrayList<Integer> arrL, int key){
        int [] result = new int[1000];

        for(int i=0; i<arrL.size(); i++){
            if(arrL.get(i) == key){
                result[arrL.get(i+1)]++;
            }
        }

        int max = Integer.MIN_VALUE;
        int mostFreq = -1;
        for(int i=0; i<result.length; i++){
            if(result[i]> max){
                max = result[i];
                mostFreq = i;
            }
        }
        return mostFreq;
    }

    public static void main(String args[]) {
        ArrayList<Integer> arrL = new ArrayList<>();
        arrL.add(2);
        arrL.add(2);
        // arrL.add(1);
        // arrL.add(200);
        arrL.add(2);
        arrL.add(2);
        arrL.add(3);
        System.out.println(mostFrequentAfterKey(arrL, 2));
    }
}
