// Question : Given n friends, each one can remain single or can be paired up with some other friend.
//  Each friend can be paired only once. Find out the total number of ways in
//   which friends can remain single or can be paired up.

package Recursion;

public class FriendPairingProblem {
    public static int FriendPairing(int n){
    if(n == 1 ||  n == 2) return n;

        // single
            // int single = FriendPairing(n-1);

            // // pair
            //  int pair = FriendPairing(n-2);
            //  int ways = (n-1) * pair;

            //  return single + ways;

        // or 
            
             return FriendPairing(n-1) + (n-1) * FriendPairing(n-2);
     }      

    public static void main(String[] args) {
        System.out.println(FriendPairing(3));
    }
}
