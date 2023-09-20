package ArrayList_Prg;

import java.util.ArrayList;

public class ArrayList_removeRange extends ArrayList<String>{
    public static void main(String[] args) {
        // ArrayList<String> str=new ArrayList<>
        //             (Arrays.asList("Hello","Hi","Yes","King","Yak","HH")); // using normal ArrayList throw an error
                                                                              // Beacuse : // extending the class to arraylist since removeRange() is a protected method

            ArrayList_removeRange str=new ArrayList_removeRange();
            str.add("ABC");
            str.add("DEF");
            str.add("GHI");
            str.add("JKL");
            str.add("MNO");
            str.add("PQR");
                    System.out.println(str);

                    str.removeRange(0,2);

                    System.out.println(str);
    }
}
