package ArrayPrg;

public class subArrayAdv {
    public static void advSubarray(int arr[]){
        int tsa=0;  // total sub array 

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                    int add=0,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
                System.out.print(" [");
                for(int k=i; k<=j; k++){
                        max=Integer.max(max,arr[k]);
                        min=Integer.min(min,arr[k]);
                        add+=arr[k];
                        System.out.print(" "+arr[k]+" ");
                }
                System.out.print("] "); tsa++;
                System.out.println(" Max :: Min :> "+max+" :: "+min+", Add : "+add);
            }
            System.out.println();
        }
        System.out.println("Total Sub Array is : "+tsa);
    }
    public static void main(String[] args) {
        int arr[]= {1,-2,6,-1,3};
        advSubarray(arr);
    }
}
