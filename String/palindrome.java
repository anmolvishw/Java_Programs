package String;

public class palindrome {
    public static boolean palindromeCheck(String str){ // O(n)
        int n=str.length();
        for (int i=0; i<n/2; i++){
            if((str.charAt(i)!=str.charAt(n-i-1)))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "racecar";
       System.out.println( palindromeCheck(str1));
    }
}