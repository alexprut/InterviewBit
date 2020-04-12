/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
	public int isBalanced(TreeNode A) {
		int res = height(A);
		if (res == -1) { return 0; }
		return 1;
	}

	public int height(TreeNode A) {
		if (A == null) { return 1; }

		int left = 0;
		int right = 0;

		if (A.left != null) { left = height(A.left); }
		if (A.right != null) { right = height(A.right); }
		if (left == -1 || right == -1) { return -1; }
		if (Math.abs(left - right) > 1) { return -1; }
		return Math.max(left, right) + 1;
	}
}
