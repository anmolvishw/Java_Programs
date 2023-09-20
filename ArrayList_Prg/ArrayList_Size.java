package ArrayList_Prg;

import java.util.ArrayList;

public class ArrayList_Size {
    public static void main(String[] args) {
        ArrayList<String> Str=new ArrayList<String>();
        
        //var.size() function return int value of size ArrayList
        System.out.println(Str.size());

        Str.add("Hi");
        Str.add("Whats up");
        Str.add("namaste");

        System.out.println(Str.size());

    }
}