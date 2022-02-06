class Solution {
    public int singleNumber(int[] nums) {
        // using XOR
        int xor =0;
        for(int a: nums){
            xor = xor^a;
        }
        return xor;
    }
}