package String;

public class subString {
    public static void subStrings(String str,int end){  
        String subString = "";
        for(int i=0; i<end; i++){
            subString +=  str.charAt(i);
        }
        System.out.println(subString);
    }
    public static void subStrings(String str,int start,int end){  
        String subString = "";
        for(int i=start; i<end; i++){
            subString +=  str.charAt(i);
        }
        System.out.println(subString);
    }
    public static void main(String[] args) {
        String str = new String("HelloWorld");
        subStrings(str,5);
        subStrings(str,2,5);
            // pre build funn
        System.out.println(str.substring(2,5));

    }
}