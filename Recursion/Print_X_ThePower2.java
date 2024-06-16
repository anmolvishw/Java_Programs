package Recursion;

public class Print_X_ThePower2 {
    public static int solution(int x, int n) {
        if(n==0) return 1;

        // int Result = solution(x,n/2) *  solution(x,n/2);  // O(n)
        int halfResult = solution(x,n/2);   // O(log n)
        int Result = halfResult * halfResult;

        if(n%2!=0) Result *= x;

        return Result;
    }

    public static void main(String[] args) {
        System.out.println(solution(2, 4));
        
    }
}
