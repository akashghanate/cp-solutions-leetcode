class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        Arrays.sort(strs);
        int minLength = Math.min(strs[0].length(), strs[strs.length-1].length());
        
        for(int i=0;i<minLength;i++){
            if(strs[0].charAt(i) == strs[strs.length-1].charAt(i)){
                result += strs[0].charAt(i);
            }
            else 
                break;
        }
        
        return result;
    }
}