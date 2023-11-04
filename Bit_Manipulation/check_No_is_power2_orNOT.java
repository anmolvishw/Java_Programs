package Bit_Manipulation;

public class check_No_is_power2_orNOT {
    public static boolean check_powis2(int n){
        return (n&n-1) == 0;
    }
    public static void main(String[] args) {
        System.out.println(check_powis2(7));
    }
}
