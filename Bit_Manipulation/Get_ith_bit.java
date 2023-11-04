package Bit_Manipulation;

public class Get_ith_bit {

    public static int get_ithBit(int n, int i){
        int bitmask = 1<<i;
        if((n & bitmask) == 0) return 0;
        else return 1;
    }
    public static void main(String[] args) {
        System.out.println(get_ithBit(5,1));
    }
}
