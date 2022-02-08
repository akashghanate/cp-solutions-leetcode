/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        // using fast and slow pointer
        // fast moves by 2, slow moves by 1
        // when fast reaches at the end, slow is at the middle
        
        ListNode fast = head;
        ListNode slow = head;
        
        // finding middle at slow
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        
        if (fast != null) { // odd nodes: let right half smaller
            slow = slow.next;
        }
    
        // reverse the second half list
        slow = reverse(slow);
        fast = head;
        while(slow != null){
            if(slow.val != fast.val)
                return false;
            slow = slow.next;
            fast = fast.next;
        }
        
        return true;
    }
    
    private ListNode reverse(ListNode head){
        ListNode prev = null;
        
        while(head != null){
            ListNode next = head.next;
            head.next = prev;
            prev=head;
            head=next;
        }
        
        return prev;
    }
}