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
	public TreeNode flatten(TreeNode a) {
		if (a == null || (a.left == null && a.right == null)) { return a; }
		if (a.right == null) {
			a.right = flatten(a.left);
			a.left = null;
			return a;
		}
		if (a.left == null) {

		}
	}
}
