package Bit_Manipulation;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int n = 100110;
        int x = 0b100;
        System.out.println(n);
        System.out.println(x);
        int pow = 0;
        
        int result = 0;
        while (n!=0){
            int temp = n % 10;
            
            // if(temp == 0) pow++;
            // else { result = result + (int)Math.pow(2, pow); 
            // pow++;
            // }

            //or

            result = result + (temp * (int)Math.pow(2, pow)); pow++;
            n/=10;
        }

        System.out.println(result);

        // System.out.println(Math.pow(5, 0));
    }
}
