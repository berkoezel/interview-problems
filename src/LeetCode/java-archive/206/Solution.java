class Solution{
	public static void main(String args[]){

	}

	public ListNode reverseList(ListNode head){
if(head == null || head.next == null) return head;

        ListNode iter = head;
        ListNode prev = null;
        ListNode next = null;
          while(iter != null){
            next = iter.next;
            iter.next = prev;
            prev = iter;
            iter = next;
          }

      return prev;
	}
}
