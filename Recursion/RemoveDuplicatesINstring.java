package Recursion;

public class RemoveDuplicatesINstring {
    public static void removeDuplication(String str, int i, StringBuilder newStr,boolean map[]){
        if(str.length() == i){
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(i);

        if(map[currChar - 'a'] == true){
            removeDuplication(str,i+1,newStr,map);
        }else{
            map[currChar - 'a'] = true;
            removeDuplication(str,i+1,newStr.append(currChar),map);
        }
    }
    public static void main(String[] args) {

        String str="anmolvishwkarma";

        removeDuplication(str,0,new StringBuilder(""),new boolean[26]);
    }   
}
