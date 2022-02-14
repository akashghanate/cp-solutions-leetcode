class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        // ArrayList<Integer> res = new ArrayList<Integer>();
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length-1;i++){
        //     if(nums[i]==nums[i+1]){
        //         res.add(nums[i]);
        //         i++;
        //     }
        // }
        // return res;
        
         List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            int index = Math.abs(nums[i])-1;
            if (nums[index] < 0)
                res.add(Math.abs(index+1));
            nums[index] = -nums[index];
        }
        return res;
    }
}