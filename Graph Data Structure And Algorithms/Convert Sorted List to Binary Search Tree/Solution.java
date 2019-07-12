/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public TreeNode sortedListToBST(ListNode a) {
		if (a == null) { return null; }
		ArrayList<Integer> list = new ArrayList<>();
		while (a != null) { list.add(a.val); a = a.next; }

		int middle = list.size() / 2;
		TreeNode root = new TreeNode(list.get(middle));
		build(true, list, root, 0, middle - 1);
		build(false, list, root, middle + 1, list.size() - 1);
		return root;
	}

	public void build(boolean isLeft, ArrayList<Integer> list, TreeNode a, int start, int end) {
		if (start <= end) {
			int middle = (start + end) / 2;
			TreeNode tmp = new TreeNode(list.get(middle));
			if (isLeft) {
				a.left = tmp;
				build(true, list, a.left, start, middle - 1);
				build(false, list, a.left, middle + 1, end);
			} else {
				a.right = tmp;
				build(true, list, a.right, start, middle - 1);
				build(false, list, a.right, middle + 1, end);
			}
		}
	}

}
