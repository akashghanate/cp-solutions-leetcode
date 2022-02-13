class KthLargest {

    // only keep k elements in the heap at any given time
    
    // min heap
    private PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
    private int k;
    
    public KthLargest(int k, int[] nums) {
        for(int a: nums){
            this.pq.offer(a);
        }
        while(this.pq.size() > k){
            this.pq.poll();
        }
        this.k = k;
    }
    
    public int add(int val) {
        this.pq.offer(val);
        
        if(this.pq.size() > this.k)
            this.pq.poll();
        
        return this.pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */