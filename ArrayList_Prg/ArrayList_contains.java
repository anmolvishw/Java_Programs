package ArrayList_Prg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// 1. Using Assignment Operator to create a copy of the reference variable
// 2. Creating a copy using the clone() method
// 3. Usage of clone() method – Deep Copy

public class ArrayList_contains {
    public static void main(String[] args) {
        ArrayList <String> str= Stream.of("Hello","World").collect(Collectors.toCollection(ArrayList::new));
        ArrayList<Integer> intt=new ArrayList<Integer>(Arrays.asList(1,2,3,4));
            
        boolean ans = str.contains("Hello");
        if(ans)
            System.out.println("Str contain  Hello");
        else
            System.out.println("Str not contain  Hello");


        if(str.contains("Hello"))
            System.out.println("Str contain Hell");
        else
            System.out.println("Str not contain Hell");


            if(intt.contains(2))
                System.out.println("intt conatin 2");
            else    
                System.out.println("int not conatain 2");

    }
}
