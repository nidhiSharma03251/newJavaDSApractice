public class practiceQuestion2 {

    static String digits[]={"Zero","One","Two","Three", "Four","Five","Six","Seven","Eight", "Nine"};
    public static void printNumbers(int n){
        if(n==0){
            return;
        }

        int lastDigit = n%10;
        printNumbers(n/10);
        System.out.print(digits[lastDigit]+ " ");
    }
    public static void main(String args[]){
        printNumbers(3459);
    }
}
