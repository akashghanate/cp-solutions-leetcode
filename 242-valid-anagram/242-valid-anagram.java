class Solution {
    public boolean isAnagram(String s, String t) {
        char[]  a1= s.toCharArray();
        char[]  a2 = t.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        
        if(new String(a1).equals(new String(a2))){
            return true;
        }
        else
           return false;
    }
}