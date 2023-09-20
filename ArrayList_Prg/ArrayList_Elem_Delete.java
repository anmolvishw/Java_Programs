package ArrayList_Prg;

import java.util.ArrayList;

public class ArrayList_Elem_Delete {
    public static void main(String[] args) {
        ArrayList<String> str=new ArrayList<String>();

        str.add("I"); // index 0
        str.add("Anmol"); // index 1

        System.out.println(str);    // output : I Anmol

        str.add(1,"am"); // Replace The STring to next index and set there in index 1
        System.out.println(str); // output : i am anmol

        str.remove(1); // remove element 
        System.out.println(str); // output : i anmol

        str.remove("Anmol"); // remove elemnt using index or there string valu e
        System.out.println(str); // output ; i

    }
}
