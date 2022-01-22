class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map =new HashMap<>();
        Set<Integer> set = new HashSet<>();
        
        for(int a: arr){
            if(map.containsKey(a)){
                map.put(a,map.get(a)+1);
            }else{
                map.put(a,0);
            }
        }
        
        for(Map.Entry<Integer,Integer> s: map.entrySet()){
            if(set.contains(s.getValue())){
                return false;
            }
            else{
                set.add(s.getValue());
            }
        }
        return true;
    }
}