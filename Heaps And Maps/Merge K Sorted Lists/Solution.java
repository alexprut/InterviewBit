/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode mergeKLists(ArrayList<ListNode> a) {
		PriorityQueue<Integer> q = new PriorityQueue<>();
		for (int i = 0; i < a.size(); i++) {
			ListNode tmp = a.get(i);
			while (tmp != null) {
				q.add(tmp.val);
				tmp = tmp.next;
			}
		}
		if (q.size() == 0) { return null; }
		ListNode head = new ListNode(q.poll());
		ListNode h = head;
		while (q.size() != 0) {
			h.next = new ListNode(q.poll());
			h = h.next;
		}
		return head;
	}
}
