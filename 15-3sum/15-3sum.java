class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // first sort
        // choose a element then implement Two sum (two pointer) to the remaining array
        
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        for(int i=0;i<nums.length;i++){
            
            // each if duplicate
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            
            int left = i+1, right=nums.length-1;
            // left and right cannot be equal
            while(left<right){
                int threesum = nums[i]+nums[left]+nums[right];
                if (threesum > 0){
                    right--;
                }
                else if(threesum < 0){
                    left++;
                }
                else{
                    res.add(new ArrayList<Integer>(Arrays.asList(nums[i],nums[left],nums[right])));
                    left++;
                    while(nums[left]==nums[left-1] && left < right)
                        left++;
                }
            }
        }
        
        return res;
    }
}