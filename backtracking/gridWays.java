public class gridWays {
    public static int totalGrids(int i, int j, int n, int m){
        if(i==n-1 && j==m-1){
            return 1;
        }else if(i==n || j==m){
            return 0;
        }

        int way1 = totalGrids(i+1, j, n, m);
        int way2 = totalGrids(i, j+1, n, m);
        return way1+way2;

    }
    public static void main(String args[]){
        int n=3;
        System.out.println(totalGrids(0,0,n,n));
    }
}
