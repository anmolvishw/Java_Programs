package Sorting;

public class selectionSort {  // O(n^2)
    public static void solution(int arr[]){
        for(int i=0; i<arr.length; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos] > arr[j])
                    minPos = j; 
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {8,1,5,6,2,3,0,6};
        solution(arr); 
        printArray.print(arr);
    }
}
