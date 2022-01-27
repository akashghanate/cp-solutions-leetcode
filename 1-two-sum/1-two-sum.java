class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] a = new int[2];
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target - nums[i])){
                a[0] = map.get(target - nums[i]);
                a[1] = i;
                return a;
            }
            else
                map.put(nums[i],i);
        }
        return a;
    }
}