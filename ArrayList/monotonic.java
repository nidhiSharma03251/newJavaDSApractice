import java.util.ArrayList;

public class monotonic {
    public static boolean Monotonic(ArrayList<Integer> arrL){
        boolean inc=true;
        boolean dec = true;
        for(int i=0; i<arrL.size()-1; i++){
            if(arrL.get(i)<arrL.get(i+1)){
                dec=false;
            }
            if(arrL.get(i)>arrL.get(i+1)){
                inc=false;
            }
        }
        return inc||dec;
    }
    public static void main(String args[]){
        ArrayList<Integer> arrL = new ArrayList<>();
        arrL.add(0);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);
        arrL.add(5);

        System.out.println(Monotonic(arrL));
    }
}
