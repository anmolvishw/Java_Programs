package String;

public class compareStrig {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");

            if(str1 == str2)
                System.out.println("Yes");
            else    System.out.println("No");
            
            if(str1 == str3)
            System.out.println("Yes");
            else    System.out.println("No");
            
            if(str1.equals(str3))
            System.out.println("Yes");
            else    System.out.println("No");


    }
}
