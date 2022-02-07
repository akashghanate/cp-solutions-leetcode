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
    public ListNode reverseList(ListNode head) {
      // Using two pointer approach
        ListNode prev=null; //empty node
        ListNode cur=head;
        
        while(cur!=null){
            ListNode next = cur.next; // temp to store cur position of list
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        
        return prev;   
    }
}