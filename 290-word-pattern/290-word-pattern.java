class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        
        if(arr.length != pattern.length())
            return false;
        
        HashMap<Character,String> mapP = new HashMap<>();
        HashMap<String,Character> mapS = new HashMap<>();
        
        int i=0;
        for(char a: pattern.toCharArray()){
            
            if(mapP.containsKey(a) && !mapP.get(a).equals(arr[i]) ){
               return false;
            } 
            if(mapS.containsKey(arr[i]) && mapS.get(arr[i])!=a){
                return false;
            }
             
            mapP.put(a,arr[i]);    
            mapS.put(arr[i],a);    
            
            i++;
        }
        
        return true;
    }
}