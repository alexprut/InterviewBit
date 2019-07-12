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
	public int lca(TreeNode A, int B, int C) {
		ArrayList<Integer> a = find(B, A, new ArrayList<Integer>());
		ArrayList<Integer> b = find(C, A, new ArrayList<Integer>());
		if (a == null || b == null) { return -1; }
		int i = a.size() - 1;
		int j = b.size() - 1;
		HashSet<Integer> set = new HashSet<Integer>();
		while (i >= 0 || j >= 0) {
			if (i >= 0) {
				if (set.contains(a.get(i))) { return a.get(i); }
				set.add(a.get(i));
				i--;
			}
			if (j >= 0) {
				if (set.contains(b.get(j))) { return b.get(j); }
				set.add(b.get(j));
				j--;
			}
		}
		return -1;
	}

	public ArrayList<Integer> find(int i, TreeNode A, ArrayList<Integer> t) {
		if (A == null) { return null; }
		if (A.val == i) {
			t.add(A.val);
			return t;
		}
		ArrayList<Integer> leftTmp = (ArrayList<Integer>) t.clone();
		leftTmp.add(A.val);
		ArrayList<Integer> rightTmp = (ArrayList<Integer>) t.clone();
		rightTmp.add(A.val);
		ArrayList<Integer> left = find(i, A.left, leftTmp);
		ArrayList<Integer> right = find(i, A.right, rightTmp);
		if (left != null) { return left; }
		if (right != null) { return right; }
		return null;
	}
}
