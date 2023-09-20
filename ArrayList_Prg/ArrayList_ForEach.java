package ArrayList_Prg;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayList_ForEach {
    public static void main(String[] args) {
    
            ArrayList<String> str= Stream.of("Hello","World","India","PK").
                                            collect(Collectors.toCollection(ArrayList::new));

             str.forEach((i)->print(i));

        
    }

    private static void print(String i) {
       System.out.println(i);
    }
}
