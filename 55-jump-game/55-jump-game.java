class Solution {
    public boolean canJump(int[] nums) {
        // sol1: DP
        
        
        // sol2: Greedy
        // calculate from end of the array, chaning the goal elemnet one-step closer to start
        int goal = nums.length - 1;
        for(int i = nums.length-1;i>=0;i--){
            if( i+ nums[i] >= goal){
                goal = i; // we are reach the goal, so shift the goal post 
            }
        }
        
        if( goal == 0){ //reached the goal that is begining of the array
            return true;
        }
        else
            return false;
    }
}