package Bit_Manipulation;



// Given a number n, Your task is to swap the two nibbles and find the resulting number. 

// A nibble is a four-bit aggregation, or half an octet. There are two nibbles in a byte. For example, the decimal number 150 is represented as 10010110 in an 8-bit byte. This byte can be divided into two nibbles: 1001 and 0110.

// Example 1:

// Input: n = 100
// Output: 70
// Explanation: 100 in binary is 01100100, two nibbles are (0110) and (0100). If we swap the two nibbles, we get 01000110 which is 70 in decimal.
// Example 2:

// Input: n = 129
// Output: 24
// Explanation: 129 in binary is 10000001, two nibbles are (1000) and (0001). If we swap the two nibbles, we get 00011000 which is 24 in decimal.


public class nibbleSwapBit {

    public static int nibbleSwap(int n){
        return ((n&0x0f)<<4 | (n&0xf0)>>4);
    }
    public static void main(String[] args) {     // 0x0f => 5 ;; 0xf0 => 240
        int n = 100;
        
      System.out.println(  nibbleSwap(n));
       
    }
}
