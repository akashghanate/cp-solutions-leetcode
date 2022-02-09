public ListNode removeElements(ListNode head, int val) {
ListNode cur=head;
ListNode res = new ListNode();
ListNode dummy = res;
while(cur!=null){
if(cur.val != val){
dummy.next = cur;
dummy = dummy.next;
}
cur=cur.next;
}
return res.next;
}