package Bit_Manipulation;

public class Even_Odd {

        public static void EvenOdd(int n){
            if ((n & 1 ) == 0)System.out.println("Even");
            else System.out.println("odd");
        }
    public static void main(String[] args) {
        EvenOdd(5);
    }
}