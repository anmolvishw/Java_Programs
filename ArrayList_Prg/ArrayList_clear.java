package ArrayList_Prg;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayList_clear {
    public static void main(String[] args) {
        ArrayList<String> str = Stream.of("HI","DEV..").collect(Collectors.toCollection(ArrayList::new));

            System.out.println(str);

            str.clear(); // this clear() function give you to ability to clear all elemnts from the list collection.

            System.out.println(str);
    }
}
