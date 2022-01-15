class Solution {
    public int bitwiseComplement(int n) {
        if(n==0){
            return 1;
        }
        int mask=0;
        int result=n;
        while (n!=0){
            n=n>>1;
            mask=(mask<<1)|1; // mask creates 32 bit number with set bits as of in n
        }
        result = mask&(~result);
        return result;
    }
}