package ArrayList_Prg;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayList_listIterator {
    public static void main(String[] args) {
        ArrayList<String> str= Stream.of("Hi","bye","Namste","Good","bye")
                                        .collect(Collectors.toCollection(ArrayList::new));

                System.out.println(str);

            ListIterator<String> strr= str.listIterator();
        // System.out.println(strr);

            while(strr.hasNext()){
                    System.out.println(strr.next());

            }
    }
}
