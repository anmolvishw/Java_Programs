package ArrayPrg;

// DSA Question Rain Water trap 

public class rainWater_Trapping_DSA_que {

    public static void solution(int arr[]){
        // left max
            int leftMax[]=new int[arr.length];
            leftMax[0]=arr[0];
                for(int i=1; i<arr.length; i++){
                    leftMax[i] = Math.max(leftMax[i-1],arr[i]);
                }
            
            int rightMax[]=new int[arr.length];
            rightMax[arr.length-1]=arr[arr.length-1];
                for(int i=arr.length-2; i>=0; i--){
                    rightMax[i] = Math.max(rightMax[i+1],arr[i]);
                }

                
            int trapped=0;
                for(int i=0; i<arr.length; i++){
                    int wall=Math.min(rightMax[i],leftMax[i]);
                    trapped += wall - arr[i];
                }

            System.out.println("Trapped Water is  : "+ trapped);
            // for(int i: leftMax){
            //     System.err.print(i+" ");
            // }
            // System.err.println();
            // for(int i: rightMax){
            //     System.err.print(i+" ");
            // }

    }
    public static void main(String[] args) {
        int arr[]= {4, 2, 0, 6, 3, 2, 5};
        solution(arr);
    }
}