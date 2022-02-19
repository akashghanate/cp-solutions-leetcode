class Solution {
    public int maxProduct(int[] nums) {
        // sol
        // find min and max product for each iteration 
        
        int res = nums[0];
        int curMax=1, curMin =1;
        
        for(int i: nums){
            int temp = curMax;
            curMax = Math.max( Math.max(i * curMax, i* curMin), i);
            curMin = Math.min( Math.min(i * temp, i* curMin), i);
            res = Math.max(res, curMax);
        }
        
        return res;
    }
}