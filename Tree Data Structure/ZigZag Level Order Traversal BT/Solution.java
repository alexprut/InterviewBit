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
	public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode A) {
		if (A == null) { return new ArrayList<ArrayList<Integer>>(); }
		LinkedList<TreeNode> q = new LinkedList<TreeNode>(); // order always to right
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		q.add(A);
		boolean toRight = true;
		while (q.size() > 0) {
			int s = q.size();
			if (toRight) {
				// To Right
				LinkedList<TreeNode> qTmp = new LinkedList<TreeNode>();
				ArrayList<Integer> resTmp = new ArrayList<Integer>();
				for (int i = 0; i < s; i++) {
					TreeNode t = q.pollFirst();
					resTmp.add(t.val);
					if (t.left != null) { qTmp.addLast(t.left); }
					if (t.right != null) { qTmp.addLast(t.right); }
				}
				res.add(resTmp);
				q = qTmp;
			} else {
				// To Left
				LinkedList<TreeNode> qTmp = new LinkedList<TreeNode>();
				ArrayList<Integer> resTmp = new ArrayList<Integer>();
				for (int i = 0; i < s; i++) {
					TreeNode t = q.pollLast();
					resTmp.add(t.val);
					if (t.right != null) { qTmp.addFirst(t.right); }
					if (t.left != null) { qTmp.addFirst(t.left); }
				}
				res.add(resTmp);
				q = qTmp;
			}
			toRight = (toRight) ? false: true;
		}
		return res;
	}
}
