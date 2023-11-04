package String;

public class stringCompression {
    public static StringBuilder solution(StringBuilder str){
    
        StringBuilder result = new StringBuilder("");
        for(int i=0; i<str.length(); i++){
            Integer count = 1;
                while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                        count++; i++;
                }
                result.append(str.charAt(i));
                // if(count >1)
                    result.append(count.toString());
            }
            return result;
    }
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("aaabbbbcddddd"); //a3b4c1d5
        System.out.println(solution(str));
    }
}
