/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
	public TreeNode sortedArrayToBST(final List<Integer> a) {
		if (a.size() < 1) { return null; }
		int middle = a.size() / 2;
		TreeNode root = new TreeNode(a.get(middle));
		cons(true, root, a, 0, middle - 1);
		cons(false, root, a, middle + 1, a.size());
		return root;
	}

	public void cons(boolean isLeft, TreeNode r, List<Integer> a, int start, int end) {
		if (start <= end) {
			int middle = (start + end) / 2;
			TreeNode tmp = new TreeNode(a.get(middle));
			if (isLeft) {
				r.left = tmp;
			} else {
				r.right = tmp;
			}
			cons(true, tmp, a, start, middle - 1);
			cons(false, tmp, a, middle + 1, end);
		}
	}
}
