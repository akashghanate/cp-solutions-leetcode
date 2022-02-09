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
        ListNode res = new ListNode();
        ListNode dummy = res;
        
        while(cur!=null){
            
            if(cur.val != val){
                dummy.next = new ListNode(cur.val, null);
                dummy = dummy.next;
                
            }
                cur=cur.next;
                
        }
        
        return res.next;
    }
}