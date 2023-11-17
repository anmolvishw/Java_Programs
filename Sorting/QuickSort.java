package Sorting;

public class QuickSort {
    public static void solution(int arr[], int start, int end){
        if (start >= end ) return;

        int pidx = terminate(arr,start, end);
        solution(arr, start, pidx-1);
        solution(arr,pidx+1, end);
    }

    public static int terminate(int arr[], int start, int end){
        int i = start - 1;
        int pivot = arr[end];

        for(int j = start; j<end; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[end] = arr[i];
        arr[i] = temp;

        return i;

    }

    public static void main(String[] args) {
        int arr[] = {-5,1,2,7,3,-1};
        solution(arr,0,arr.length-1);
        printArray.print(arr);
        System.out.println();
    }
}
