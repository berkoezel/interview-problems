public class Solution {
    public boolean hasCycle(ListNode head) {
			 if(head == null || head.next == null) return false;
       ListNode end;
			 ListNode iter=head;
			 while(iter.next != null){
					iter = iter.next;
			 }
			 end = iter;
    }
}
