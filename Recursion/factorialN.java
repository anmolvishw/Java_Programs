package Recursion;

public class factorialN {
    public static int fact(int n){
        if (n == 0 || n==1) return 1;
        return n*fact(n-1);
    }

    public static void factSol(int n){
        if(n == 1 || n==0){ System.out.print(n); return;}
        System.out.print(n+" x ");
        factSol(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        factSol(n);
        System.out.println(" : "+fact(n));
    }
}
