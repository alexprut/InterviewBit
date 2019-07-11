/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode deleteDuplicates(ListNode A) {
		if (A.next == null) {
			return A;
		}
		int current = A.next;
		int prev = A;
		while (current != null) {
			ListNode tmp = current.next;
			if (current.val == prev.val) {
				prev.next = tmp;
				current = tmp;
			} else {
				prev = current;
				current = tmp;
			}
		}
		return A;
	}
}
