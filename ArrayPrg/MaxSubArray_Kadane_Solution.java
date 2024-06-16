package ArrayPrg;

public class MaxSubArray_Kadane_Solution {

    public static void getMaxSubArray(int arr[]) {
    int curr_sum=0;
    int max_sum=Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            curr_sum = curr_sum + arr[i];           
                if(curr_sum < 0) curr_sum=0;
            max_sum = Math.max(curr_sum, max_sum);    
        }
        System.out.println("Max is " + max_sum);
    }
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        getMaxSubArray(arr);
    }
}
+