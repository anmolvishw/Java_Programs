package ArrayPrg;

public class MaxMin {
    public static int max(int arr[]) {
        int max=Integer.MIN_VALUE;

        for(int i=0; i<arr.length;i++){
                if(arr[i] > max)
                    max=arr[i];
        }
        return max;
    }

    public static int min(int arr[]) {
        int min=Integer.MAX_VALUE;

        for(int i=0; i<arr.length;i++){
                if(arr[i] < min)
                    min=arr[i];
        }
        return min;
    }

     public static void sortMaxMin(int arr[]) {
        arraysort.sortarrayASC(arr);
        System.out.println("max : "+arr[arr.length-1]);
        System.out.println("min : "+arr[0]);
    
    }
    public static void main(String[] args) {
        int arr[]= {3,6,2,1,8,7,4,5,3,1};

        System.out.println(max(arr));
        System.out.println(min(arr));
       
        sortMaxMin(arr);
    }
}
