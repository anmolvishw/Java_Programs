package Recursion;

public class FirstOccurrence {
    public static int FirstOccurrenceFun(int arr[], int key, int i){
        if(arr.length == i) return -1;
       if(arr[i]==key) return i;
       return  FirstOccurrenceFun(arr,key,i+1);
    }
    public static void main(String[] args) {
        int arr[] = {8,4,5,3,6,7,0,1,2};
        System.out.println(FirstOccurrenceFun(arr,2,0));
    }
}
