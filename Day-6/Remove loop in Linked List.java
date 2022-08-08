class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                break;
            }
        }
        if(slow==fast){
            slow = head;
            if(slow!=fast){
                while(slow.next!=fast.next){
                    slow = slow.next;
                    fast = fast.next;
                }
                fast.next = null;
            }
            else{
                while(fast.next!=slow){
                    fast = fast.next;
                }
                fast.next = null;
            }
        }
    }
    
}
//Solution two using hashing
class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
       HashSet<Node> s = new HashSet<Node>();
       Node prev =null;
       while(head!=null){
           if(s.contains(head)){
               prev.next = null;
           }
           else{
               s.add(head);
               prev = head;
               head = head.next;
           }
       }
    }
    
}
