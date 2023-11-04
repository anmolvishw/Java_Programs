package ArrayList_Prg;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayList_ensureCapacity {
    public static void main(String[] args){
       try {
        
             ArrayList<Integer> intt = Stream.of(1,2,3,4,5,6,7,8,9,0).collect(Collectors.toCollection(ArrayList::new));

        intt.ensureCapacity(12);
        intt.add(11);
        intt.add(12);
        intt.add(13);
        intt.add(14);
        System.out.println(intt.size());
        System.out.println(intt);

       } catch (Exception e) {
        System.out.println(e);
       }
    }
}
