package ArrayList_Prg;

import java.util.ArrayList;

public class ChangingElement {
    public static void main(String[] args) {
        ArrayList <String> Str=new ArrayList<String>();
        Str.add("I"); //index 0
        Str.add("Don't Like"); //index 1
        Str.add("Coding"); // index 2

        System.out.println(Str);

        // VarName.set(index,Elemnt);
        Str.set(1,"Love");
        System.out.println(Str);

        // ---or--- 

        Str.add("I"); // index 0
        Str.add("Anmol"); // index 1

        System.out.println(Str);    // output : I Anmol

        Str.add(4,"am"); // Replace The String to next index and set there in index 1
        System.out.println(Str); // output : i am anmol

        Str.set(1,"hate");
        System.out.println(Str);
    }
}
