class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i: nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i) + 1);
            }
            else{
                map.put(i,1);
            }
        }
        
        // max frequency can be length of nums
        List[] bucket = new ArrayList[nums.length+1];
        
        for(int key: map.keySet()){
            int frequency = map.get(key);
            if(bucket[frequency] == null){
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }
        
        List<Integer> result = new ArrayList<Integer>();
        for(int i= bucket.length -1; i>=0 && result.size() < k; i--){
            if(bucket[i] != null){
                result.addAll(bucket[i]);
            }
        }
        
        int[] res = new int[result.size()];
        for(int i=0;i<result.size();i++){
            res[i] = result.get(i);
        }
        
        return res;
    }
}