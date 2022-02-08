1. using fast and slow pointer
2. fast moves by 2, slow moves by 1
3. when fast reaches at the end, slow is at the middle
4. Iterate fast till it reaches end of the list
​
now we have middle at slow pointer, reverse the right of slow
now check if both slow and the main list are same
​
while(fast != null && fast.next != null){
fast = fast.next.next;
slow = slow.next;
}