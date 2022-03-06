class Solution {
    public int getSum(int a, int b) {
        // cannot use +,-
        // but XOR can be used bitwise to replicate addition of bit
        // carry can be calculated using bit & 
        
        // Logic:
        // a^b : for base
        // a&b << 1 : carry for each bit
         
        // T.C: O(1)
        
        // using b for carry and at last carry will be 0
        while(b!=0){
            int temp = (a & b) << 1; // carry 
            a = a ^ b;
            b = temp;
        }
        
        return a;
    }
}