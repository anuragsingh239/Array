public class StockByAndSell {
//    static int Profit(int []arr){
//        int profit=0;
//        int n=arr.length;
//        for(int i=1;i<n;i++){
//            if(arr[i]>arr[i-1]){
//                profit+=(arr[i]-arr[i-1]);
//            }
//        }return profit;
//    }

//    ONE MORE APPROACH

    static int maxProfit(int[]prices){
        int n= prices.length;
        int minPrice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<n;i++){
            if(prices[i]<minPrice){
                minPrice=prices[i];
            }
            maxprofit=Math.max(prices[i]-minPrice,maxprofit);
        }return maxprofit;
    }
}
