package ArrayList_Prg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayList_initialize {
    public static void main(String[] args) {
        // initlization synatx

        //:. ArrayList <data_type> var_name = new ArrayList<data_type>(Size);
        ArrayList <String> str=new ArrayList<String>();
        str.add("Hello");
        System.out.println(str);

        ArrayList<String> str1 = new ArrayList<String>(Arrays.asList("Hello","World"));
        System.out.println(str1);

        //using list class prefernces

        List <String> str2=new ArrayList<String>();
        str2.add("Hi");
        System.out.println(str2);

        List<String> str3=new ArrayList<String>(List.of("Hi","Developers"));
        System.out.println(str3);

        List<String> str4 = new ArrayList<String>(str3);
        System.out.println(str4);

        ArrayList<String> list= Stream.of("Hello","Anmol").collect(Collectors.toCollection(ArrayList::new));
        /*
                        // ^^^^^^^^^^^^^^^^^^^^^^^^^^^^
                        // create a stream of elements using Stream.of()
                        // method collect the stream elements into an
                        // ArrayList using the collect() method and
                        // Collectors.toCollection() method
         */
        System.out.println(list); // print Arraylist
    }
}
