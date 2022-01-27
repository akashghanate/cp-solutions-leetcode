class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int low = 0, high =n-1;
        int mid = (low+high)/2;
        
        while(low<high){
            if(arr[mid]<arr[mid+1]){
                low = mid+1;
            }
            else{
                high = mid;
            }
            mid = (low+high)/2;
        }
        return high;
    }
}