package Sorting;

public class insertionSort {
        public static void solution(int arr[]){
           for(int i=1; i<arr.length; i++){
            int curr=arr[i],prev = i-1;

            while(prev >=0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
           }
        }
    public static void main(String[] args) {
        int arr[] = {8,1,5,6,2,3,0,6};
        solution(arr);
        printArray.print(arr);
    }
}
