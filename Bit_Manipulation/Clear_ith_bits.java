package Bit_Manipulation;

public class Clear_ith_bits {
    public static int clear_ithBit(int n, int i){
            int bitmask = ~0<<i;

        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clear_ithBit(5,2));
    }      
}
