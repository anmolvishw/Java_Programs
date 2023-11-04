package String;

public class countVowel { // a e i o u

        public static int  solution (StringBuilder str){
            int count = 0; 
            for(int i=0; i<str.length(); i++){ 
                char ch = str.charAt(i);
                    if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
                       ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' ){
                            count++;
                       }
            }
            return count;
        }
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Anmol Ankit sharma"); // 6
        System.out.println("Total Vowel in this String is : "+solution(str));
    }
}
