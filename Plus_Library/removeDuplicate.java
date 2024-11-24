package Plus_Library;

class removeDuplicate{
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 9, 9};
        int sizeArr = arr.length;
        int[] resArr = new int[sizeArr];
        int val = 0;
        
        for(int i = 0; i < sizeArr; i++) {
            if (val == 0 || arr[i] != resArr[val - 1]) {
                resArr[val] = arr[i];
                val++;
            }
        }
        
    
        int i = 0;
        for(int j = 1; j<arr.length; j++){
            if(arr[i] != arr [j]){
                int temp = arr[i + 1];
                arr[i+1] = arr [j];
                arr[j] = temp;
                i++;
            }
        }
        System.out.println(i+1+" ouput ");

        for (i = 0; i < val; i++) {
            System.out.print(resArr[i] + " ");
        }
    }
}
