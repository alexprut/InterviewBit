/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode detectCycle(ListNode a) {
		HashSet<ListNode> set = new HashSet<>();
		if (a == null || a.next == null) { return null; }
		set.add(a);
		while (a.next != null) {
			a = a.next;
			if (set.contains(a)) {
				return a;
			} else {
				set.add(a);
			}
		}
		return null;
	}
}
