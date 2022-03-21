import java.util.ArrayList;

class Solution {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        while(head!=null) {
            arr.add(head.val);
            head = head.next;
        }
        
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i) != arr.get(arr.size() - 1 - i)) return false;
        }
        
        return true;
    }
}
