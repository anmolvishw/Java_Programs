
package Recursion;

public class AllOccurrence {
    public static void AllOccurrenceFun(int arr[], int key, int i){

    if(i == arr.length-1)
    {
        System.out.println(i);
        return;
    }

    if(arr[i] == key)
        System.out.print(i+", ");

    AllOccurrenceFun(arr,key,i+1);
    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2, 5};
        int key = 5;

        AllOccurrenceFun(arr,key,0);
        // System.out.println(AllOccurrenceFun(arr,key,0));
    }
}