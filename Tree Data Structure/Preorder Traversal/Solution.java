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
	public ArrayList<Integer> preorderTraversal(TreeNode A) {
		if (A == null) { return new ArrayList<Integer>(); }
		ArrayList<Integer> res = new ArrayList<Integer>();
		LinkedList<TreeNode> stack = new LinkedList<>();
		stack.push(A);
		while (stack.size() > 0) {
			TreeNode c = stack.pop();
			res.add(c.val);
			if (c.right != null) {
				stack.push(c.right);
			}
			if (c.left != null) {
				stack.push(c.left);
			}
		}

		return res;
	}
}
