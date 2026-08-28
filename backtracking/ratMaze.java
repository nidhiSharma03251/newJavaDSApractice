public class ratMaze {
    public static int mazeWays(int maze[][], int i, int j, int n ,int m){
        if(i==n-1 && j==m-1){
            return 1;
        }else if(i==n || j==m){
            return 0;
        }

        
        int way1= mazeWays(maze, i+1, j, n, m);
        int way2= mazeWays(maze, i-1, j, n, m);
        int way3= mazeWays(maze, i, j+1, n, m);
        int way4= mazeWays(maze, i, j-1, n, m);
        return way1+way2+way3+way4;
    }
    public static void main(String args[]){
        int maze[][]= {{1,0,0,0},
                        {1,1,0,1},
                        {0,1,0,0},
                        {1,1,1,1}};

        mazeWays(maze,0,0,4,4);
    }
}
