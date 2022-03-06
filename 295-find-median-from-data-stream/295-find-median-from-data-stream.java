class MedianFinder {
    // sol
    // use 2 priorityQueue [small heap, large heap] i.e small <= large
    // always keep length balance b/w the heaps such that the difference of no.elements is not more than one
    
    PriorityQueue<Integer> left; // max heap
    PriorityQueue<Integer> right; //min heap
    public MedianFinder() {
        left = new PriorityQueue<Integer>(Collections.reverseOrder());
        right = new PriorityQueue<Integer>();
    }
    
    public void addNum(int num) {
        left.offer(num);
        right.offer(left.poll());
        
        if(right.size() > left.size()){
            left.offer(right.poll());
        }
    }
    
    public double findMedian() {
        if(left.size() == right.size()){
            // even number of elements
            return (left.peek() + right.peek()) /2.0;
        }
        return left.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */