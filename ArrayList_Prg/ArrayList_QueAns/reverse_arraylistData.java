package ArrayList_Prg.ArrayList_QueAns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class reverse_arraylistData {
    public static void main(String[] args) {
        ArrayList<String> str=new ArrayList<>(Arrays.asList("A","B","C","D","E","F","G","H"));
         System.out.println(str);

            // using reverse function
         Collections.reverse(str);
         System.out.println(str);

System.out.println("------------------------------");

         // using Logic
            ArrayList<String> str1= Stream.of("A","B","C","D","E","F","G","H") .collect(Collectors.toCollection(ArrayList::new));
            System.out.println(str1);

            ArrayList<String> res=new ArrayList<>();
            System.out.println(res);

            for(int i=str1.size()-1; i>=0; i--){
                res.add(str1.get(i));
            }

            System.out.println(res);
    }
}
