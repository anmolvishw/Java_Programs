package String;

public class stringDeCompression {
    public static StringBuilder solution(StringBuilder str){
        StringBuilder result = new StringBuilder("");
        int count=0;
       
            for(int i=0; i<str.length(); i++){
                    if(Character.isDigit(str.charAt(i))){
                        count = Character.getNumericValue(str.charAt(i));
                        char ch = str.charAt(i-1);
                        while(count > 1){
                            result.append(ch);
                            count--;
                        }
                    }else{
                        result.append(str.charAt(i));
                    }
            }  

        return result;
    }
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("a3b4cd5"); //aaabbbbcddddd
        // System.out.println(Character.isDigit(str.charAt(2)));
        System.out.println(solution(str)); 
    }
}
