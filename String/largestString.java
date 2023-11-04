package String;

public class largestString {
        public static String LString(String fruit[]){
                String Large = fruit[0];
            for(int i=1; i<fruit.length; i++){
                if(Large.compareTo(fruit[i])>0)
                     Large = fruit[i];
            }
            return Large;
        }
    public static void main(String[] args) {
        String fruits[] = {"Apple","Banana","Oango","Orange"};
                System.out.println(LString(fruits));
    }
}
