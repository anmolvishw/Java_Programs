package ArrayList_Prg;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayList_sublist {
    public static void main(String[] args) {
        try {
            ArrayList<Character> ch=Stream.of('a','b','c','d','e').collect(Collectors.toCollection(ArrayList::new));

        System.out.println(ch);
        System.out.println(ch.indexOf('c'));
        
        ch.forEach((i)-> System.out.println(i+" of index  "+ch.indexOf(i)));
        
        // AMking sublist of list

        List<Character> chh= ch.subList(2,6);
        System.out.println(chh);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
