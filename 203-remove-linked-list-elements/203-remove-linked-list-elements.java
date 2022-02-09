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
    public ListNode removeElements(ListNode head, int val) {
        ListNode cur=head;
        ListNode dummy = new ListNode(0,head);
        ListNode prev = dummy;
        
        while(cur!=null){
            ListNode next = cur.next;
            
            if(cur.val == val){
                prev.next = next;
            }
            else
               prev = cur;
            cur=cur.next;
        }
        
        return dummy.next;
    }
}