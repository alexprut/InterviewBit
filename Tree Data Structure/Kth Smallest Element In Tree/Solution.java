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
	public int kthsmallest(TreeNode A, int B) {
		if (A == null) { return 0; }
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		populate(q, A);
		while (B > 2) { q.poll(); B--; }
		return q.poll();
	}

	public void populate(PriorityQueue<Integer> q, TreeNode A) {
		if (A == null) { return; }
		q.add(A.val);
		populate(q, A.left);
		populate(q, A.right);
	}
}
