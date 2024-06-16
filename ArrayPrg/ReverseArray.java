package ArrayPrg;

public class ReverseArray {

    public static void reverseArray(int arr[]){
        int start=0,end = arr.length-1;
        while(start < end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        
        for(int i : arr){
            System.out.print(" "+i);
        }
        System.out.println();
        
        reverseArray(arr);
        for(int i : arr){
            System.out.print(" "+i);
        }
        System.out.println();

    }
}
