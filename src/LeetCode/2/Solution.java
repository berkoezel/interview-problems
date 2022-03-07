import java.util.ArrayList;


public class Solution{

	private static class ListNode{
		int val;
		ListNode next;
		ListNode(){}
		ListNode(int val){
			this.val = val;
		}
	}
	public static void main(String args[]){
	ListNode l1 = new ListNode(2);
	l1.next = new ListNode(4);
	l1.next = new ListNode(3);

	ListNode l2 = new ListNode(5);
	l2.next = new ListNode(6);
	l2.next = new ListNode(4);
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2){
		int num = makeNumber(l1) + makeNumber(l2);
		String numArr = Integer.toString(num);
		ListNode l3 = new ListNode();
		for(int i=0; i<numArr.length(); i++)
			l3.next = new ListNode(numArr.charAt(i) - '0');
		return l3;
	}


	private int makeNumber(ListNode l1){
		ArrayList<Integer> digits = new ArrayList<>();
		int number = 0;
		while(l1 != null){
			digits.add(l1.val);
			l1 = l1.next;
		}
		for(int i = 0; i<digits.size(); i++)
			number += digits.get(i) * Math.pow(10, i);
		return number;
	}
}


