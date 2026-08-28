public class permutation {
    public static void totalPermutation(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            System.out.println("_____________________");
            System.out.println("i=" + i);
            System.out.println("ch: "+ ch);
            System.out.println("str: "+ str +" " + "newStr: " + newStr);
            System.out.println("_____________________");
            totalPermutation(newStr, ans+ch);
        }
    }
    public static void main(String args[]){
        String str = "abc";
        totalPermutation(str,"");
    }
}
