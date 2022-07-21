// 2 - Add Two Numbers

/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */

func addTwoNumbers(l1 *ListNode, l2 *ListNode) *ListNode {
	if l1 == nil || l2 == nil {
		if l1 == nil && l2 == nil {
			return nil
		}
		if l1 == nil {
			return l2
		}
		return l1
	}

	var c int = 0
	var queue []int

	var l1iter, l2iter *ListNode
	l1iter = l1
	l2iter = l2
	var digitSum int = 0
	for ; l1iter != nil; l1iter = l1iter.Next {
		digitSum = l1iter.Val + c
		if l2iter != nil {
			digitSum += l2iter.Val
			l2iter = l2iter.Next
		}
		if digitSum > 9 {
			c = 1
			digitSum -= 10
		} else {
			c = 0
		}
		queue = append(queue, digitSum)
	}
	for ; l2iter != nil; l2iter = l2iter.Next {
		digitSum = l2iter.Val + c
		if digitSum > 9 {
			c = 1
			digitSum -= 10
		} else {
			c = 0
		}
		queue = append(queue, digitSum)
	}
	if c != 0 {
		queue = append(queue, c)
	}
	l3 := &ListNode{0, nil}
	l3iter := l3
	for n := 0; n < len(queue); n++ {
		l3iter.Val = queue[n]
		if n+1 != len(queue) {
			l3iter.Next = &ListNode{0, nil}
			l3iter = l3iter.Next
		}
	}

	return l3
}