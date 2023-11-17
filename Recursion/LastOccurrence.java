package Recursion;

public class LastOccurrence {
    public static int LastOccurrenceFun(int arr[], int key, int i) {
        if (arr.length == i)
            return -1;
        int isFind = LastOccurrenceFun(arr, key, i + 1);
        if (isFind == -1 && arr[i] == key)
            return i;

        return isFind;
    }

    public static void main(String[] args) {
        int arr[] = { 8, 4, 5, 3, 6, 7, 0, 1, 5 };
        System.out.println(LastOccurrenceFun(arr, 0, 0));
    }
}
