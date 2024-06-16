package Recursion;

public class is2xPower {
    public static boolean IsX2Power(long n){
        if (n == 0)
            return false;
 
        while (n != 1) {
            if (n % 2 != 0)
                return false;
            n = n / 2;
        }
        return true;
    }
    public static void main(String[] args) {
        long n = 32;

        System.out.println("=> "+IsX2Power(n));
    }
}