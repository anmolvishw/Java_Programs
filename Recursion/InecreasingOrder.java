package Recursion;

public class InecreasingOrder {
    public static void printIncOrder(int n){
        if(n == 1) {
        System.out.print(n+" ");    
            return;
        }
        printIncOrder(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
       printIncOrder(50);
    }
}
