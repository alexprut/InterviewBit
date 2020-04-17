public class Solution {
	int[][] adj;
	public int minPathSum(ArrayList<ArrayList<Integer>> A) {
		if (A.size() == 0) { return 0; }
		adjF(A.size(), A.get(0).size());
		b(A, 0, 0, 0);
		return adj[adj.length - 1][adj[0].length - 1];
	}

	public void b(ArrayList<ArrayList<Integer>> A, int i, int j, int c) {
		if (adj[i][j] > A.get(i).get(j) + c) {
			adj[i][j] = A.get(i).get(j) + c;
			if (i + 1 < A.size()) {
				b(A, i + 1, j, adj[i][j]);
			}
			if (j + 1 < A.get(0).size()) {
				b(A, i, j + 1, adj[i][j]);
			}
		}
	}

	public void adjF(int m, int n) {
		adj = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				adj[i][j] = Integer.MAX_VALUE;
			}
		}
	}
}
