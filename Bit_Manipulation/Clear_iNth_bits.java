package Bit_Manipulation;

public class Clear_iNth_bits {

    public static int clear_iNthBit(int n,int i, int j){
        int a = (~0) << (j+1);
        int b = (1<<i)-1;
        int bitmask = a | b;
        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clear_iNthBit(86,2,5));
    }
}
