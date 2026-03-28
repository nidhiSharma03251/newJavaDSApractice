package recursion;

public class tilingProblem {
    public static int recurTiling(int n){
        if (n==0 || n==1){
            return 1;
        }

        int verticalChoice = recurTiling(n-1);
        int horizontalChoice = recurTiling(n-2);

        int totalWays = verticalChoice + horizontalChoice;
        return totalWays;
    }
    public static void main(String args[]){
        System.out.println(recurTiling(6));
        // System.out.println('n'-'a');
    }
}
