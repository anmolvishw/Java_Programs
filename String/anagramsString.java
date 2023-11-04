package String;

import java.util.Arrays;

public class anagramsString {
    public static boolean solution(String str1, String str2){
        
        
        if(str1.length() != str2.length()) return false;
            else{
                str1 = str1.toLowerCase(); str2 = str2.toLowerCase();
                char [] ch1 = str1.toCharArray();
                char [] ch2 = str2.toCharArray();
                Arrays.sort(ch1); Arrays.sort(ch2);
               return  Arrays.equals(ch1,ch2);
            }
    } 
    public static void main(String[] args) {
        String str1 = new String("Heart");
        String str2 = new String("earth");

            System.out.println(solution(str1,str2));
    }
}
