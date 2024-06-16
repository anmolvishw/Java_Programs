package ArrayPrg; 
import java.util.*;

public class subarray_with_0_sum {
    public static boolean solution(int arr[]){
         Set<Integer> set= new HashSet<Integer>();
         set.add(0);
         int setSubsum=0;

         for(int i=0; i<arr.length; i++){
            setSubsum+=arr[i];
            if(set.contains(setSubsum)) return true;
            set.add(setSubsum);
         }
         return false;
    }
    public static void main(String[] args) {
        int[] arr= { 1,-2,2 };
        System.out.println(solution(arr));
    }
}
