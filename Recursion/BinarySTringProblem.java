// Que : Print all N string binary no withour consecutive once.

package Recursion;

public class BinarySTringProblem {
    public static void BinaryStringSolution(int n,int lastplace,String str){
        if (n==0 ){
            System.out.println(str);
            return;
        }

   
        BinaryStringSolution(n-1,0,str+"0");
        
        if (lastplace == 0) {
        BinaryStringSolution(n-1,1,str+"1");
    }
}
    public static void main(String[] args) {
        BinaryStringSolution(3,0,"");
    }
}