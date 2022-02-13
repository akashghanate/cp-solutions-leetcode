class Solution {
    public boolean isIsomorphic(String s, String t) {
        // s should be isomorphic to t and
        // t should be isomorphic to s
        // map charcters of both string with each other while checking if they are only mapped to single character 
        
        HashMap<Character,Character> mapS = new HashMap<>();
        HashMap<Character,Character> mapT = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            
            if((mapS.containsKey(a) && mapS.get(a) != b) || (mapT.containsKey(b) && mapT.get(b) != a)){
                return false;
            }
            
            mapS.put(a,b);
            mapT.put(b,a);
        }
        
        return true;
    
    }
}