package MiniProjectExam;

// formula  nCr = n!/r! (n-r)!

public class BinomialCoefficient {

    public static float result(int n,int r){
        int n_r = fact(n-r);
        n = fact(n);
        r = fact(r);
        return n/(r * n_r);
    }
    public static int fact(int value){
        int ans=1;
        for(int i=1; i<=value; i++){
                ans = ans * i;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 5;
        int r = 2;

        System.out.println(result(n, r));
    }
}
