package Recursion;

public class DecreasingOrder {
    public static void printDecOrder(int n){
        if (n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDecOrder(n-1);
    }
    public static void main(String[] args) {
       printDecOrder(50);
    }
}
