// Question : Givrn a 2 X n board and tiles of size 2 x 1, 
// count the number of ways to tile the given board using the 2 x 1 tiles.
//  (A tile can either be placed horizontally or verticallu.)

package Recursion;

public class TilingProblem {
    public static int tilingProblem(int n){
        if(n ==0 || n == 1) return 1;

        // vertical Choice
        int vertical = tilingProblem(n-1);

        // horizontal Choice
        int horizontal = tilingProblem(n-2);

        return vertical + horizontal;
    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(4));
    }
}
