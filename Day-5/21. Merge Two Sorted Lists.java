//Solution 1 using entirely new linked list
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
   ListNode head = new ListNode(0);
        ListNode p =head;
        ListNode p1=list1;
        ListNode p2=list2;
        while(p1!=null && p2!=null){
            if(p1.val<p2.val){
                p.next =p1;
                p1=p1.next;
            }
            else{
                p.next = p2;
                p2=p2.next;
            }
          p=p.next;  
        }
        if(p1!=null)
          p.next=p1;
        if(p2!=null)
            p.next=p2;
        return head.next;
    }
}
//Solution 2 using inplace sorting of linked list
class LinkedList
{
    //Function to merge two sorted linked list.
    
    Node sortedMerge(Node head1, Node head2) {
    if(head1 == null){
        return head2;
    }
    if(head2 == null){
        return head1;
    }
    if(head1.data<=head2.data){
        head1.next = sortedMerge(head1.next,head2);
        return head1;
    }
    else{
        head2.next=sortedMerge(head1,head2.next);
        return head2;
    }
   } 
}
