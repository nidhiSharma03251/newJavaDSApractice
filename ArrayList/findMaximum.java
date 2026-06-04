import java.util.ArrayList;

public class findMaximum {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(23);
        list.add(13);
        list.add(45);
        list.add(5);

        int max = Integer.MIN_VALUE;

        for(int i=0; i<list.size(); i++){
            // if(list.get(i) > max){
            //     max = list.get(i);
            // }
            max = Math.max(max, list.get(i));
        }
        System.out.println("Maximum value: " + max);
    }
}
