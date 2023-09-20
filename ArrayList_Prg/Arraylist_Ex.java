package ArrayList_Prg;
import java.util.*;

class Arraylist_Ex{
    public static void main(String[] args) {
        int Size=5;

        // ArrayList <Integer> arr=new ArrayList<Integer>(); //or
        ArrayList <Integer> arr=new ArrayList<Integer>(Size);
        System.out.println("ArrayList Without add : "+arr);

            arr.add(55); //arrayVar.add(value) help to push vlaue in Array list var
            arr.add(56);
            arr.add(57);
            arr.add(57);
            arr.add(59);
            arr.add(60); // out of size but work thats ArrayList Collection FW

        System.out.println(arr);

        //ArrayList Type String
        ArrayList <String> Str=new ArrayList<String>();
        Str.add("Hello");
        Str.add("World");

        System.out.println(Str);

    }
}

// Explanation:
// ArrayList is a dynamic array and we do not have to specify the size while creating it, 
// the size of the array automatically increases when we dynamically add and remove items. 
// Though the actual library implementation may be more complex, the following is a very basic 
// idea explaining the working of the array when the array becomes full and if we try to add an item:

// Creates a bigger-sized memory on heap memory (for example memory of double size).
// Copies the current memory elements to the new memory.
// The new item is added now as there is bigger memory available now.
// Delete the old memory