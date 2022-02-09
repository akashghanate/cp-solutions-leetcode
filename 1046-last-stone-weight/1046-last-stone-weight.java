class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> p=new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int a: stones){
            p.add(a);
        }

        while(p.size()>1){
            int max1 = p.poll();
            int max2=p.poll();
            if(max1!=max2){
                p.add(max1-max2);
            }
        }
        
        return p.isEmpty() ? 0 : p.poll();
        
    }
}