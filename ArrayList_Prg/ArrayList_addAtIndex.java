package ArrayList_Prg;

import java.util.ArrayList;

public class ArrayList_addAtIndex {
    public static void main(String[] args) {
        ArrayList<Integer> intt = new ArrayList<Integer>();

        System.out.println(intt);
       // intt.add(1,55); // Exception Throw "java.lang.IndexOutOfBoundsException: Index: 1, Size: 0"

       intt.add(0,55); // Index : 0, Size : 0
        System.out.println(intt);

        

    }
}
