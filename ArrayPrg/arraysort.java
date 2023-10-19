package ArrayPrg;

public class arraysort {
    public static void sortarrayASC(int []arr){
        for(int i=0; i<arr.length; i++){
            int temp;
            for(int j=i+1; j<arr.length; j++)    {
                if(arr[i] > arr[j])
                    {       // swap
                        temp = arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
            }
        }
  
        
    }
// for descending order

    public static void sortarrayDSC(int []arr){
        for(int i=0; i<arr.length; i++){
            int temp;
            for(int j=i+1; j<arr.length; j++)    {
                if(arr[i] < arr[j])
                    {       // swap
                        temp = arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
            }
        }
        
    }
    
    public static void main(String[] args) {
        int []arr={3,6,2,1,8,7,4,5,3,1};

        for(int i: arr)
            System.out.print(i+" ");
            
            sortarrayDSC(arr);
            
      for(int i: arr)
         System.out.print(i+" ");
    }
}
