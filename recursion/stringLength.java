public class stringLength {
    public static int lengthRecursion(String str,int i){
        if(i==str.length()){
            return 0;
        }

        return lengthRecursion(str, i+1)+1;
    }
    public static void main(String args[]){
        System.out.println(lengthRecursion("Nidhi", 0));
    }
}
