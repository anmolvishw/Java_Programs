public class unknown {

    public static void sol(int arr[]){
        int sum=0; 
        int sumMax = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            
            for(int j=i; j<arr.length; j++){
                sum=0;
                for(int k=i; k<=j; k++){
                    sum=sum+(arr[k]);
                }
                sumMax = Math.max(sum,sumMax);
            }
        }

        System.out.println(sumMax);
    }
    public static void main(String[] args) {
        int arr[]={1,-2,3,1,5,7};
        sol(arr);
    }
}