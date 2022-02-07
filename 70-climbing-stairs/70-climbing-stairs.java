class Solution {
    public int climbStairs(int n) {
        // Dynamic programming
        int one=1; // step 1 from last second stair
        int two=1; // on last step
        
        // Bottom up approach, storing last two sub-solutions
        for(int i=0;i<n-1;i++){
            int temp=one;
            one=one+two;
            two=temp;
        }
        
        return one;
    }
}