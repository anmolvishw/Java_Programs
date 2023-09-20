package ArrayList_Prg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayList_removeAll {
    public static void main(String[] args) {
        ArrayList<Integer> intt= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8));
            ArrayList<Integer> inttt=Stream.of(2,3,4,5).collect(Collectors.toCollection(ArrayList::new));

            System.out.println(intt);
            System.out.println(inttt);
            
            intt.removeAll(inttt);
            System.out.println(intt);
            System.out.println(inttt);

            
    }
}
