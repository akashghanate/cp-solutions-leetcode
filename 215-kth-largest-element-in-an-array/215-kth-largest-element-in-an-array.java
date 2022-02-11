class Solution {
    public int findKthLargest(int[] nums, int j) {
        // sol1:
        // sort array and return length-k element O(nlogn)
        
        // sol2:
        // create Max heap, pop k times O(n+ klogn)
        
        // sol3:
        // Quick select algo baseed on parition of quick sort
        int k = nums.length - j;
        return quickSelect(0,nums.length-1,nums,k);
    }
    
    private int quickSelect(int low, int high, int[] nums, int k){
        int pivot = nums[high];
        int i=low;
        
        for(int j=low;j<high;j++){
            if(nums[j]<=pivot){
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
        }
        
        int temp = nums[i];
        nums[i]=nums[high];
        nums[high]=temp;
        
        if(i > k){
           return quickSelect(low, i-1, nums, k);
        }
        else if(i < k){
           return quickSelect(i+1, high, nums, k);
        }
        else
            return nums[i];
    }
}