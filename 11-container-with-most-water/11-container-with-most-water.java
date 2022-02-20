class Solution {
    public int maxArea(int[] height) {
        // brute force sol  TC: O(n^2)
//         int res =0;
        
//         for(int left=0; left<height.length;left++){
//             for(int right=left+1; right< height.length;right++){
//                 int area = (right-left) * Math.min(height[left],height[right]);
//                 res = Math.max(res,area);
//             }
//         }
        
//         return res;
        
        // sol2 O(n)
        // Two pointer
        int res =0;
        int l=0,r=height.length-1;
        while(l<=r){
            int area = (r-l) * Math.min(height[l],height[r]);
            res = Math.max(res,area);
            if(height[l]<=height[r]){
                l++;
            }
            else
                r--;
        }
        
        return res;
    }
}