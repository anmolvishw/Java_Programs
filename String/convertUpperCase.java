package String;

public class convertUpperCase {
    public static String convertToUpperCase(String str){
        StringBuilder result = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        result.append(ch);

        for(int i=1; i<str.length(); i++){
            ch = str.charAt(i);
            if(ch == ' ' && i<str.length()-1){
                result.append(ch);
                i++;
                result.append(Character.toUpperCase(str.charAt(i)));
            }else result.append(ch);
        }
    return result.toString();

    }
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("I am, backend Developer.");
        System.out.println(convertToUpperCase(str.toString()));
    }
}
