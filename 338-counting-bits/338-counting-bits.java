class Solution {
    public int[] countBits(int n) {
        // DP problem
        // the pattern changes for every 4 digits so the offset changes for every power of 2
        int[] ans = new int[n+1];
        
        int offset = 1;
        
        ans[0]=0;

        for(int i=1;i<=n;i++){
            if(offset * 2 == i){
                offset = i;
            }    
            ans[i] = 1+ ans[i-offset];
        }
        
        return ans;
    }
}