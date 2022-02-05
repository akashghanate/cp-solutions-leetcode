class Solution {
//     Dynamic Programming
    public int rob(int[] nums) {
        int rob1=0, rob2=0;
        
        // rob1,rob2, i, i+1, i+2 .....
        for(int i=0;i<nums.length;i++){
            int temp = Math.max(nums[i] + rob1, rob2);
            rob1=rob2;
            rob2=temp;
        }
        
        return rob2;
    }
}