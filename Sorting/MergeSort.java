package Sorting;

public class MergeSort {
    public static void MergeSortSol(int arr[],int start, int end){
        if(start >= end)
            return;

        int mid = start + (end - start )/2;  // (start + end )/2;
        MergeSortSol(arr, start, mid);  // left part 
        MergeSortSol(arr, mid+1, end);  // right part
        
        Merge(arr,start,mid,end); // Merge the divided array
    }

    public static void Merge (int []arr, int start, int mid, int end ){
        // left (0,3) = 4 <> right (4,6(end)) = 3   <<>> 6 - 0 + 1  = 7

        int temp[] = new int[end-start+1];
        int i = start;  // iterator for left part
        int j = mid+1; // iterartot for right part
        int k = 0; // iterator for temp arr

            while(i <= mid && j <= end){
                    if(arr[i] < arr[j]){
                        temp[k] = arr[i];
                        i++;
                    }
                    else{
                        temp[k] = arr[j];
                        j++;
                    }
                    k++;
            }

            // left part
            while(i <=mid)
                temp[k++] = arr[i++];

            //right part
            while(j <= end)
                temp[k++] = arr[j++];

            // copy temp to original arr
            for(k=0,i=start; k<temp.length; k++,i++)
                arr[i] = temp[k];
    }

    public static void main(String[] args) {
        int arr[] = {6,0,5,7,1,5,3,0,-2,1,-1};
        MergeSortSol(arr,0,arr.length-1);
        printArray.print(arr);
        System.out.println();
    }
}
