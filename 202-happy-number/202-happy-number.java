class Solution {
    public boolean isHappy(int n) {
        // if n is not a happy number somewhere in the process a infinte cycle is created
        // use hash set to keep track of visited number
        HashSet<Integer> seen = new HashSet<Integer>();
        
        while(!seen.contains(n)){
            seen.add(n);
            n = sumOfSquares(n);
            if(n==1){
                return true;
            }
        }
        return false;
        
    }
    
    private int sumOfSquares(int n){
        int sum =0;
        while(n!=0){
            int digit = n%10;
            sum = sum + digit*digit;
            n=n/10;
        }
        return sum;
    }
}