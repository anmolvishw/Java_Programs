package ArrayPrg;

class BestTimeToBuy_profit_stock{
    public static void solution(int arr[]){

        int buy=Integer.MAX_VALUE; // suppose buy at max value at time
        int maxProfit = 0; 

            for(int i=0; i<arr.length; i++){
                if(buy < arr[i]){
                    int profit = arr[i] - buy;
                    maxProfit = Math.max(profit,maxProfit);
                }
                else
                    buy = arr[i];
            }

            System.out.println("Max Profit = "+maxProfit);
    }
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        // int arr[]={7,6,5,3,2,1};
        solution(arr);
    }
}