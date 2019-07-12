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
	public ArrayList<ArrayList<Integer>> levelOrder(TreeNode A) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		if (A == null) { return res; }
		LinkedList<TreeNode> queue = new LinkedList<>();
		queue.add(A);
		while (queue.size() > 0) {
			int size = queue.size();
			ArrayList<Integer> tmp = new ArrayList<>();
			for (int i = 0; i < size; i++) {
				TreeNode current = queue.pollLast();
				tmp.add(current.val);
				if (current.left != null) {
					queue.add(current.left);
				}
				if (current.right != null) {
					queue.add(current.right);
				}
			}
			res.add(tmp);
		}
		return res;
	}
}
