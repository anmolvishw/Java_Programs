package ArrayList_Prg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayList_removeIf {
    public static void main(String[] args) {
        ArrayList<Integer> intt = Stream.of(1,2,3,4,5,6,7,8,9,0).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(intt);

        intt.removeIf(i-> (i%2==0));
            System.out.println(intt);

            ArrayList<String> str=new ArrayList<>
                    (Arrays.asList("Hello","Hi","Yes","King","Yak","HH"));

            System.out.println(str);

            str.removeIf(i-> (i=="Hi"));

            System.out.println(str);

            str.removeIf(i-> (i.charAt(0)=='Y'));
            System.out.println(str);
    }
}
