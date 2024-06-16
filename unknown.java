public class unknown {

    public static void sol(int arr[],int n){
        int count = 1;
        for (int i : arr) {
            if(i == n) {
                System.out.println(count);
                return;
            }
            count++;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,-2,3,1,5,7};
        int n=1;
        sol(arr,n);
        
    }
}