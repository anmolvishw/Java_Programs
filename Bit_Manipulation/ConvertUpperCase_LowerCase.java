package Bit_Manipulation;

public class ConvertUpperCase_LowerCase {
    public static void convert(String str){
        for(int i=0; i<str.length(); i++){
            for(char j='A'; j<='Z'; j++){
                if(str.charAt(i) == j){
                    System.out.print( (char)(str.charAt(i) | ' '));
                    i++;
                }
            }
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
    public static void main(String[] args) {
        convert("HelLo");
    }
}
