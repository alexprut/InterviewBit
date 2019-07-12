
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
	public int maxDepth(TreeNode A) {
		return maxDepthD(A, 0);
	}

	public int maxDepthD(TreeNode A, int c) {
		if (A == null) { return c; }
		return Math.max(maxDepthD(A.left, c + 1), maxDepthD(A.right, c + 1));
	}
}