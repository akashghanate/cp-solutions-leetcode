class Solution {
    public boolean isPowerOfTwo(int n) {
        for(int i=0;i<=30;i++){
            int pow = (int)Math.pow(2,i);
            if(pow == n){
                return true;
            }
        }
        return false;
    }
}