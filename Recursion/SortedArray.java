package Recursion;

public class SortedArray {
    public static boolean checkSortedArray(int arr[],int i){
        if(arr.length-1 == i) return true;
        if(arr[i]>arr[i+1]) return false;
        return checkSortedArray(arr,i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,5,4,5};
        System.out.println(checkSortedArray(arr,0));
    }
}
