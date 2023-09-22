package ArrayList_Prg.ArrayList_QueAns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Delete_duplicates {
    public static void main(String[] args) {
        ArrayList<Integer> int1=new ArrayList<Integer>(Arrays.asList(1,2,1,3,5,2,3,5,8,0));
        System.out.println(int1);
        
        // Now let's remove duplicate element without affecting order 
        // LinkedHashSet will guaranteed the order and since it's set 
        // it will not allow us to insert duplicates. 
        // repeated elements will automatically filtered.\
        
        Set<Integer> set = new LinkedHashSet<Integer>(int1);
        int1.clear();
        
        int1.addAll(set);
        System.out.println(int1);
        
        
        ArrayList<Integer> intt=new ArrayList<Integer>(Arrays.asList(1,2,1,3,5,2,3,5,8,0));
        System.out.println(intt);        

        ArrayList<Integer> newset=new ArrayList<Integer>();
        System.out.println(newset);

        for (int i : intt ){
            if(!newset.contains(i)){
                newset.add(i);
            }
        }

        System.out.println(newset);

    }
}
