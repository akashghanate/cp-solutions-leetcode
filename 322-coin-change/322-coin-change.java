class Solution {
    public int coinChange(int[] coins, int amount) {
        // Dp Problem
        // Bottom-up approach
        int[] dp = new int[amount+1];
        Arrays.fill(dp, amount+1); // put a max value as default
        dp[0]=0;
        
        for(int i=1;i<=amount;i++){
            
            for(int c: coins){
                // for non-negative amount
                if(i-c >=0){
                    dp[i] = Math.min(dp[i], 1 + dp[i-c]);
                }
            }
        }
        
        // edge case if we didnt find number of coins
        if(dp[amount] != amount+1){
            return dp[amount];
        }
        
        return -1;
    }
}