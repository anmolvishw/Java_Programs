package Bit_Manipulation;

public class update_ith_Bit {

    public static int update_ithBit(int n, int i, int newBit){
       n = Clear_ith_bit.solution(n,i);
       int bitmask = newBit<<i;
       return n | bitmask;
    }

    public static void main(String[] args) {
        System.out.println(update_ithBit(5,2,1));
    }
}
