package ArrayList_Prg;

import java.util.ArrayList;

public class ArrayList_Print {
    public static void main(String[] args) {
        ArrayList<String> str=new ArrayList<String>();
        ArrayList<Integer> intt=new ArrayList<Integer>();

        str.add("ABC");
        str.add("DEF");
        str.add("GHI");
        str.add("JKL");


        intt.add(01);
        intt.add(02);
        intt.add(03);
        intt.add(04);

        // --- Printing str or intt

        System.out.println(str);
        System.out.println(intt);
        
        //Using foreach loop 

        for(int i=0; i<str.size(); i++){
            System.out.println(str.get(i));
            System.out.println(intt.get(i));
        }

        for(String i:str){
                System.out.print(i+" ");
        }
        for(int i: intt)
            System.out.print(i+" ");
        
        
    }
}
