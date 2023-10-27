package ArrayPrg;

public class findindex_search {
    public static int findIndexUsingLinearSearch(int arr[],int key){
        for(int i=0; i<arr.length; i++)
            if(arr[i]==key)
                return i;   
        return -1;
    }

     public static int findIndexUsingBinarySearch(int arr[],int key){
        System.out.println("The binary Search is sort the array first then perform search ");
        int start=0,end=arr.length-1;
        arraysort.sortarrayASC(arr); // sort an array

        while(start <= end){
            int mid= (start+ end)/2;
            if(arr[mid] == key)
                return mid;

            if(key > arr[mid])
                start = mid+1;
            else
                end = mid-1;
        }
        return -1;
     }
    public static void main(String[] args) {
        int arr[]= {3,6,2,1,8,7,4,5,3,5};
        int key=1;

        System.out.println(key+" at location of index : "+findIndexUsingLinearSearch(arr,key));
        System.out.println(key+" at location of index : "+findIndexUsingBinarySearch(arr,key));

    }
}
