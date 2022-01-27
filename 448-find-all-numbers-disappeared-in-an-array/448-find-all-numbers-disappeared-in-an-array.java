class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            int index = (int) Math.abs(nums[i]) - 1;
            nums[index] = -(int)Math.abs(nums[index]);
        }
         for (int i = 0; i < nums.length; i++) {
            if(nums[i] > 0){
                res.add(i+1);
            }
        }
        return res;
    }
}