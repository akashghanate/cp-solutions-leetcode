class Solution {
    public int bitwiseComplement(int n) {
        if(n==0){
            return 1;
        }
        int mask=0;
        int result=n;
        while (n!=0){
            n=n>>1;
            mask=(mask<<1)|1;
        }
        result = mask&(~result);
        return result;
    }
}