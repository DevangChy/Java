// Count total paths in a maze to move from (0,0) to (n,m).

public class AdvanceRecursion02 {
    public static int countPath(int i, int j, int n, int m){
        if(i == n || j == m){
            return 0;
        }
        if(i == n-1 && j == m-1){
            return 1;
        }
        //move downwards
        int downPaths = countPath(i+1, j, n, m);
        // move right
        int rightPaths = countPath(i, j+1, n, m);
        return downPaths + rightPaths;
    }
    public static void main(String[] args) {
        int n = 3, m = 4;
        int totalPaths = countPath(0, 0, n, m); 
        System.out.println(totalPaths);
    }
}