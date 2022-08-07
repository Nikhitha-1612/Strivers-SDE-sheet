class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      
        ListNode dummy_head = new ListNode();
        ListNode l3=dummy_head;
        int carry=0;
        while(l1!=null || l2!=null){
            int l1va = (l1!=null)?l1.val:0;
            int l2va =(l2!=null)?l2.val:0;
            int curr_sum = l1va+l2va+carry;
            carry = curr_sum/10;
            int last_digit = curr_sum%10;
            
            ListNode new_node = new ListNode(last_digit);
            l3.next=new_node;
            if(l1!=null)
                l1=l1.next;
            if(l2!=null)
                l2=l2.next;
            l3=l3.next;
        }
        if(carry>0){
            ListNode new_node = new ListNode(carry);
            l3.next=new_node;
            l3=l3.next;
        }
        return dummy_head.next;
    }
}
