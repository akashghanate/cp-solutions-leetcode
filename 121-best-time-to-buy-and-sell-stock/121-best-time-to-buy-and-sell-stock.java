class Solution {
    public int maxProfit(int[] prices) {
        // sliding window problem using two pointer
        int i=0; // buy
        int j=1; // sell
        int max =0;
        
        while(j<prices.length){
            if(prices[i]<prices[j]){
                max = Math.max(max, prices[j]-prices[i]);
            }
            else{
                i=j;
            }
            j++;
            
        }
        
        return max;
    }
}