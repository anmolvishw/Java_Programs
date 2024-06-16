package ArrayPrg;

public class MaxSubArray_Prefix_Solution {

    public static void getMaxSubarray(int arr[]){
        int []prefix=new int[arr.length];
        int max=Integer.MIN_VALUE, add=0;

        // calculate prefix
            prefix[0]=arr[0];
        for (int i=1; i<prefix.length; i++)
                prefix[i]=prefix[i-1]+ arr[i];

                
                for(int i=0; i<arr.length; i++){
                    for(int j=i; j<arr.length; j++){
                        add= i==0 ? prefix[j] : prefix[j] - prefix[i-1];
                    }
                    max=Integer.max(max,add);
                }
                System.out.println("Max is : "+max);
        }
        public static void main(String[] args) {
            int arr[]={-2,-3,4,-1,-2,1,5,-3};
            getMaxSubarray(arr);
        }   
}