class Solution {
    public ListNode middleNode(ListNode head) {
       ListNode temp=head;
        int len=0;
        while(temp!=null){
            temp = temp.next;
           len++; 
        }
        int size=(int)Math.floor(len/2);
        temp =head;
        for(int i=1;i<size+1;i++){
            temp=temp.next;
        }
        return temp;
    }
}
