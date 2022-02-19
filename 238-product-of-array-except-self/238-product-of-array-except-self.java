class Solution {
    public int[] productExceptSelf(int[] nums) {
        // calculate prefix product for each elemnt and store it in ouput array
        // calculate postfix product for each elemnt and store it in ouput array
        int[] res = new int[nums.length];
        Arrays.fill(res,1);
        
        int prefix =1;
        for(int i=0;i<nums.length;i++){
            res[i] = prefix;
            prefix = prefix*nums[i]; 
        }
        
        int postfix = 1;
        for(int i=nums.length-1;i>=0;i--){
            res[i] = res[i] * postfix;
            postfix = postfix*nums[i]; 
        }
        
        return res;
    }
}