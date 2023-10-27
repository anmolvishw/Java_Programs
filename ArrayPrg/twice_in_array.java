package ArrayPrg;

import java.util.HashSet;

public class twice_in_array {
    //brute Method O(n^2)
    public static boolean solution(int arr[]){
        for(int i=0; i<arr.length; i++)
            for(int j=i+1; j<arr.length; j++)
                if(arr[i]==arr[j]) return true;
            
    return false;
        
    }

    // O(n)
    public static boolean solution1(int arr[]){
            HashSet<Integer> set = new HashSet<>();
                for(int i: arr)
                    if(set.contains(i)) return true;
                    else set.add(i);
            return false;
    }

    public static void main(String[] args) {
        int arr[]={5,2,3,1};
        System.out.println("Is array have twice value : "+solution(arr));
        System.out.println("Is array have twice value : "+solution1(arr));
    }
}
