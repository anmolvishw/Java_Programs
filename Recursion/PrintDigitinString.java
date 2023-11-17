package Recursion;

public class PrintDigitinString {
    static String[] strDigit={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};

    public static void PriniStringDigit(int n){
        if(n==0)
        return;

        int temp = n%10;
        PriniStringDigit(n/10);
        System.out.print(strDigit[temp]+" ");
    }
    public static void main(String[] args) {
        PriniStringDigit(10234);
        System.out.println();
    }
}
