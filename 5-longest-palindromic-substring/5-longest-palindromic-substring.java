class Solution {
    public String longestPalindrome(String s) {
        // two pointers start from i and expand outwords in both direction
        String res="";
        int max = 0;
        
        if(s.length() <2)
            return s;
        
        for(int i=0;i<s.length();i++){
            
            // odd lenth
            int left = i,right=i;
            while(left >=0 && right <s.length() && s.charAt(left)==s.charAt(right)){
                if(right - left + 1 > max){
                    max = right - left+1;
                    res= s.substring(left,right+1);
                }
                left--;
                right++;
            }
            
            // even lenth
            left = i;
            right=i+1;
            while(left >=0 && right <s.length() && s.charAt(left)==s.charAt(right)){
                if(right - left + 1 > max){
                    max = right - left+1;
                    res= s.substring(left,right+1);
                }
                left--;
                right++;
            }
        }
        
        return res;
    }
}