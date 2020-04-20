/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode rotateRight(ListNode A, int B) {
		if (A == null || A.next == null) { return A; }
		int l = 0; ListNode c = A; while (c != null) { l++; c = c.next; }
		c = A; ListNode p = null; ListNode start = A;
		if (B % l == 0) {
			return A;
		}
		for (int i = 0; i < l - (B % l); i++) {
			p = c; c = c.next;
		}
		A = c;
		p.next = null;
		while (c.next != null) { c = c.next; }
		c.next = start;

		return A;
	}
}
