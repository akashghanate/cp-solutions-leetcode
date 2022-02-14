class Solution {
    public int majorityElement(int[] nums) {
        // sol1
//         HashMap<Integer,Integer> map = new HashMap<>();
        
//         int n = nums.length;
//         for(int i=0;i<n;i++){
//             if(map.containsKey(nums[i])){
//                 int frequency = map.get(nums[i])+1;
//                 if(n < frequency*2){
//                     return nums[i];
//                 }
//                 map.put(nums[i],frequency);
//             }
//             else
//                 map.put(nums[i],1);
//         }
        
//         return 0;
        
        // sol2
        // Booye-moore, works only in-condition if array also has a majority element
        
        int major = nums[0], count=1;
        for(int i=1;i<nums.length;i++){
            if(count==0){
                major=nums[i];
                count++;
            }
            else if(major==nums[i]){
                count++;
            }
            else
                count--;
        }
        
        return major;
    }
}