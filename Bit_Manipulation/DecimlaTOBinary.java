package Bit_Manipulation;

public class DecimlaTOBinary {
    public static void main(String[] args) {
        int dec = 100;
        int result = 0; int pow = 0;

        while (dec!=0) {
            int temp = dec % 2;
            result =  result + (temp * (int)Math.pow(10, pow));
            pow++;
            dec/=2;
        }

        System.out.println(result);
        // System.out.println();
     
    }
}
