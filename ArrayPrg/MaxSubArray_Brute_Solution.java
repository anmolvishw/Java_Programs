package ArrayPrg;

public class MaxSubArray_Brute_Solution {
    public static void getmaxSubarray(int arr[]){
        int max=Integer.MIN_VALUE,add=0;
        subarray.subarrayprint(arr); // for printing help of sub array
            for(int i=0; i<arr.length; i++){
                for(int j=i;j<arr.length; j++){
                    add=0;
                    for(int k=i; k<=j; k++){
                        add+=arr[k];
                    }
                    max=Integer.max(max,add);
                }
            }
            System.out.println("Max is : "+max);
    }
    public static void main(String[] args) {
        
        int arr[]={-1,11,3,-5,-3,1,7};
        subArrayAdv.advSubarray(arr);
        getmaxSubarray(arr);
    }
}
