//starting index in the  loop
public class Solution {
    public ListNode detectCycle(ListNode head) {
       ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast){
                ListNode slow2 = head;
                while(slow2!=slow){
                    slow2=slow2.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }
}
