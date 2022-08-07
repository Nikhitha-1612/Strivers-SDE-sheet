class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp1 = new ListNode(0);
        temp1.next=head;
        ListNode slow = temp1;
        ListNode fast = temp1;
        for(int i=1;i<=n+1;i++){
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
    return temp1.next;
    }
}
