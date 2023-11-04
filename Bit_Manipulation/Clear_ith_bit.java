package Bit_Manipulation;

public class Clear_ith_bit {
    public static int clear_ithBit(int n, int i){ // this is use to clear and set 1 to 0 to 1
            int bitmask = 1<<i;
            return n ^ bitmask;
    }
    public static int solution(int n, int i){
            int bitmask = ~(1<<i);
            return n & bitmask;
    }
    public static void main(String[] args) {
        int n=4,i=2;
        System.out.println(clear_ithBit(n,i));
        System.out.println(clear_ithBit(n,i));
    }
}
