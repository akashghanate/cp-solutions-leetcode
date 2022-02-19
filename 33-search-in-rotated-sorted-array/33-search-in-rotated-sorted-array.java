class Solution {
    public int search(int[] nums, int target) {
        
        int k = pivot(nums);
        if(target >= nums[k] && target <=nums[nums.length-1]){
            return binarySearch(nums,k,nums.length-1,target);
        }
        else
            return binarySearch(nums,0,k-1,target);

    }
    
    private int pivot(int[] nums){
        int s=0, e=nums.length-1;
        int m=0;
        while(s<e){
            m=s+(e-s)/2;
            if(nums[m]>=nums[nums.length-1]){
                s=m+1;
            }
            else
                e=m;
        }
        
        return s;
    }
    
    private int binarySearch(int[] nums, int left, int right,int target){
        if(left<=right){
            int m= left+(right-left)/2;
            if(nums[m]==target)
                return m;
            else if(nums[m] < target){
                return binarySearch(nums,m+1,right,target);
            }
            else
                return binarySearch(nums,left,m-1,target);
        }
        return -1;
    }
}