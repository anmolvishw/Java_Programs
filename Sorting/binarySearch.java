class binarySearch{
    public static void main(String[] args) {
        int arr[] = {1,5,7,8,9,13,16,56,99};
        int key = 17;

        
      
        System.out.println(funCall(arr,key));
    }

    public static int funCall(int arr[],int key){
        int start = 0; int end = arr.length -1 ;
        

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == key)
                return mid;
            
            if(arr[mid] > key) 
                end = mid - 1;
            else   
                start = mid + 1;
        }
    return -1;
    }
}