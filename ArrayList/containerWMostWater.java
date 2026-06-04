import java.util.ArrayList;

public class containerWMostWater {
    public static int mostWater(ArrayList<Integer> height){
        int maxWater = 0;
        int lp = 0;
        int rp = height.size()-1;

        while(lp<rp){
            int h = Math.min(height.get(lp), height.get(rp));
            int w = rp-lp;
            int water = h*w;
            maxWater = Math.max(water, maxWater);

            if(height.get(lp) < height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String args[]){
        ArrayList<Integer> height = new ArrayList<>();
        height.add(2);
        height.add(7);
        height.add(6);
        height.add(3);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);

        System.out.println(mostWater(height));
        
    }
}
