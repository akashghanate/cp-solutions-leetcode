class Solution {
    public int maxNumberOfBalloons(String text) {
        // SC: O(n) TC: O(n)
        int result = Integer.MAX_VALUE;
        String match = "balloon";
        HashMap<Character,Integer> inputMap = new HashMap<Character,Integer>();
        HashMap<Character,Integer> ballonMap = new HashMap<Character,Integer>();
        ballonMap.put('b',1);
        ballonMap.put('a',1);
        ballonMap.put('l',2);
        ballonMap.put('o',2);
        ballonMap.put('n',1);
        
        for(char a : text.toCharArray()){
            if(inputMap.containsKey(a)){
                inputMap.put(a, inputMap.get(a) + 1);
            }
            else{
                inputMap.put(a,1);
            }
        }
        
        for(char a: match.toCharArray()){
            result = Math.min( result,( inputMap.get(a) == null ? 0 :  inputMap.get(a)) / ballonMap.get(a));
        }
        
        return result;
    }
}