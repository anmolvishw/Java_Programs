package MiniProjectExam;

public class PrintReverseANNo {
    public static void main(String[] args) {
        int n = 29052003;
        int ans=0;
        while (n!=0) {
            int lastdigit = n%10;
            ans = (ans *10) + lastdigit;
            n/=10;
        }
        System.out.println(ans);
    }
}
