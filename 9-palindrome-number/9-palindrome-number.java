class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int res=0;
        int temp=x;
        while(x!=0){
            int digit = x%10;
            res = res*10+digit;
            x=x/10;
        }
        System.out.println(res);
        if(temp==res)
            return true;
        else
            return false;
    }
}