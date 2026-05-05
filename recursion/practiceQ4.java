public class practiceQ4 {
    public static int palindromeWords(String str, int i, int j, int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        int res = palindromeWords(str, i+1, j, n-1) + palindromeWords(str, i, j-1, n-1) - palindromeWords(str, i+1, j-1, n-2); 
        return res;

    }
    public static void main(String[] args) {
        String str = "abcab";
        int n= str.length();
        System.out.println(palindromeWords(str, 0, n-1, n));
    }
}
