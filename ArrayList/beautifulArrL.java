import java.util.ArrayList;

public class beautifulArrL {
    public static ArrayList<Integer> Beautiful(int n){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);

        for(int i=2; i<=n; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int e:list){
                if(2*e-1<=n){
                    temp.add(e*2-1);
                }
            }
            for(int e:list){
                if(2*e<=n){
                    temp.add(e*2);
                }
            }
            
            list=temp;
        }
        return list;
    }
    public static void main(String args[]){
        System.out.println(Beautiful(6));
    }
}
