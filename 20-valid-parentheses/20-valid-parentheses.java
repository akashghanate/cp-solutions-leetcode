class Solution {
    public boolean isValid(String s) {
        char[] arr = s.toCharArray();
        
         // keep a map of closing to opening
        Map<Character,Character> map = new HashMap<Character,Character>();
        map.put('}','{');
        map.put(')','(');
        map.put(']','[');
        
        // if string starts with closing
        if(map.containsKey(arr[0]))
            return false;
        
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<arr.length;i++){
           if(map.containsKey(arr[i])){
               if(!stack.isEmpty() && stack.peek() == map.get(arr[i])){
                   stack.pop();
               }
               else
                   return false;
           }
            else
                stack.push(arr[i]);
        }
        
        if(stack.isEmpty()){
            return true;
        }
        
        return false;
    }
}