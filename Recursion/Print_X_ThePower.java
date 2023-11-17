package Recursion;

public class Print_X_ThePower {
    public static int solution(int x, int n) {
        if (n == 0) return 1;
        return x * solution(x, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(solution(5, 5));
    }
}
