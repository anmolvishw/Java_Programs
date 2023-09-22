package ArrayList_Prg;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_toArray {
    public static void main(String[] args) {
        ArrayList<String> str=new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
        System.out.println(str);
        
        Object[] obj=str.toArray();
        System.out.println(obj);  // [Ljava.lang.Object;@7ad041f3  : beacuse it now convert an araay print on index bases
        System.out.println(obj[0]);
        
        for (Object s : obj) 
            System.out.println(s);
        
        System.out.println();
        
        //or -----------------------------------

        ArrayList<String> str1=new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
        System.out.println(str1);
        
        //  Integer[] obj1=str1.toArray(); //cannot convert from Object[] to Integer[]  --  
        //String [] obj1=str1.toArray(); ////cannot convert from Object[] to String[]
        
        String[] obj1= new String[str1.size()]; // first initliaze integer as array with arraylist size size
        obj1=str1.toArray(obj1); // And passes array toarray fun and hold on the array var
        
        for (String i : obj1) 
        System.out.print(i);
        
        System.out.println();
        
        
        
    }
}
