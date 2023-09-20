package ArrayList_Prg;

import java.util.ArrayList;

public class ArrayList_get {
    public static void main(String[] args) {
        //------In String  ----
        ArrayList <String> str=new ArrayList<String>();

        //System.out.println(str.get(0)); // throw Exception "Index out of bound" 
        str.add("Hi");
        System.out.println(str.get(0)); // Result : Hi


        //----- In Interger -----
        ArrayList<Integer> INT=new ArrayList<Integer>();
        INT.add(55);

        System.out.println(INT.get(0));
        
    }
}
