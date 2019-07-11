/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 *
 *
 *  prev -> current -> next -> a -> b
 *      [                  ]
 *                            [      ]
 *  prev -> next -> current -> a -> b
 *
 */
public class Solution {
	public ListNode swapPairs(ListNode A) {
		if (A == null) { return A; }

		ListNode head = A;
		ListNode prev = null;
		ListNode current = A;
		ListNode next = A.next;

		while (current != null & next != null) {
			if (head == current) { head = next; }

			if (prev != null) { prev.next = next; }

			ListNode tmp = next.next;
			next.next = current;
			current.next = tmp;

			prev = current;
			current = current.next;
			if (current != null) {
				next = current.next;
			}
		}

		return head;
	}
}
