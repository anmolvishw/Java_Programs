package ArrayList_Prg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class ArrayList_sort {
    public static void main(String[] args) {
        ArrayList<String> store= new ArrayList<String>(Arrays.asList("Hello","World","Ice","Ball","Apple"));
        System.out.println(store);

        Collections.sort(store);
        System.out.println(store);

        List<Integer> list= Stream.of(4,2,7,1,5,0).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

    }
}