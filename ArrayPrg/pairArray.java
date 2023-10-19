package ArrayPrg;

public class pairArray {
    
    public static void pairArrayPrint(int arr[]){
            for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                    System.out.print("("+arr[i]+","+arr[j]+") ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        pairArrayPrint(arr);
    }
}
