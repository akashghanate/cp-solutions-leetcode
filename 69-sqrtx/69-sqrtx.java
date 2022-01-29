class Solution {
    public int mySqrt(int x) {
        int ans=-1;
        long start=0, end =x;
        long mid = start+ (end-start)/2;
        while(start<=end){
            long sq =mid*mid;
            if(sq == x){
                return (int)mid;
            }
            if(sq < x){
                ans=(int)mid;
                start =mid+1;
            }
            else
                end = mid-1;
            mid = start+ (end-start)/2;
        }
        
        return ans;
    }
}