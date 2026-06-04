import java.util.ArrayList;
import java.util.Collections;

public class swap {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Before swap: " + list);

        int idx1 = 4;
        int idx2 = 1;

        int temp = list.get(4);
        list.set(4, list.get(1));
        list.set(1, temp);

        System.out.println("After swap: " + list);

        Collections.sort(list);
        System.out.print("After sorting:" + list);
        System.out.println();
        Collections.sort(list, Collections.reverseOrder());
        System.out.print("After reverse sorting:" + list);
    }
}
