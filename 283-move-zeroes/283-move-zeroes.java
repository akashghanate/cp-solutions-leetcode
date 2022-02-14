class Solution {
    public void moveZeroes(int[] nums) {
        int current=0;
        for(int a:nums){
            if(a!=0){
              nums[current++] = a; 
            }
        }
        
        for(int i=current;i<nums.length;i++){
            nums[i]=0;
        }
    }

}