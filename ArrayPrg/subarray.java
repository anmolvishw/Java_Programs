package ArrayPrg;

public class subarray {

    public static void subarrayprint(int arr[]){
        for(int i=0; i<arr.length; i++){
        
            for(int j=i; j<arr.length; j++){
                System.out.print("[");
                    for(int k=i; k<=j; k++){
                       System.out.print(" "+arr[k]+" ");
                    }
                    System.out.print(" ] ");
                }
                System.out.println();
                System.out.println();
        }
    }

    public static void main(String[] args) {
        int []arr={5,6,2,1,8,3,1};

        // //for print all arr elemnt

        // for(int i: arr){
        //     System.out.print(i+" ");
        // }

            // arraysort.sortarrayASC(arr); // after sort
        subarrayprint(arr); // for sub array creations
    }
}
