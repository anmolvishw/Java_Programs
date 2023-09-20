package ArrayList_Prg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class ArrayList_addAll {
    public static void main(String[] args) {
        ArrayList<String> str1= Stream.of("Hello","world").collect(Collectors.toCollection(ArrayList::new));  
        ArrayList <String> str2=new ArrayList<String>(Arrays.asList("I","Love","India","or","Bharat"));     
        
        System.out.println(str1); // Output : [Hello, world]
        System.out.println(str2); // Output : [I, Love, India, or, Bharat]

        str1.addAll(str2);
        System.out.println(str1); // Output : Hello, world, I, Love, India, or, Bharat]
        System.out.println(str2); // Output : [I, Love, India, or, Bharat]
        
        str2.addAll(str1);
        System.out.println(str1); // Output : [Hello, world, I, Love, India, or, Bharat]
        System.out.println(str2); // Output : [I, Love, India, or, Bharat, Hello, world, I, Love, India, or, Bharat]
        
        str1.addAll(2,str2);
        System.out.println(str1); // Output : [Hello, world, I, Love, India, or, Bharat, Hello, world, I, Love, India, or, Bharat, I, Love, India, or, Bharat]
        System.out.println(str2); // Output : [I, Love, India, or, Bharat, Hello, world, I, Love, India, or, Bharat]


    }
}