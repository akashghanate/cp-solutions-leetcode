class Solution {
    public boolean isPerfectSquare(int num) {
        int s=1,e=num;
        
        while(s<=e){
            long m = s + (e-s)/2;
            if(m*m == num){
                return true;
            }
            else if( m*m > num){
                e= (int) m-1;
            }
            else{
                s = (int) m+1;
            }
        }
        
        return false;
    }
}