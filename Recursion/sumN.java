package Recursion;

public class sumN {
    public static int sum(int n){
        if (n == 0 || n==1) return 1;
        return n+sum(n-1);
    }

    public static void sumSol(int n){
        if(n == 1 || n==0){ System.out.print(n); return;}
        sumSol(n-1);
        System.out.print(" + "+n);
    }
    public static void main(String[] args) {
        int n=10;
        sumSol(n);
        System.out.println(" : "+sum(n));
    }
}
