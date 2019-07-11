/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode insertionSortList(ListNode A) {
		if (A == null) { return null; }
		ArrayList<ListNode> tmp = new ArrayList<>();
		Collections.sort(tmp, new Comparator<ListNode>() {
			public int compare(ListNode a, ListNode b) {
				return (a.val < b.val) ? -1 : 1;
			}
		});
		for (int i = 1; i < tmp.size(); i++) {
			tmp.get(i-1).next = tmp.get(i);
		}
		tmp.get(tmp.size() - 1).next = null;
		return tmp.get(0);
	}
}
