public class Solution {
	int counter = 0;
	public int uniquePathsWithObstacles(ArrayList<ArrayList<Integer>> A) {
		if (A.size() == 0) { return counter; }
		bfs(A, 0, 0);
		return counter;
	}

	public void bfs(ArrayList<ArrayList<Integer>> A, int x, int y) {
		if (x == A.size() - 1 && y == A.get(0).size() - 1 && A.get(x).get(y) != 1) {
			counter++;
		} else {
			if (A.get(x).get(y) != 1) {
				if (x + 1 < A.size()) {
					bfs(A, x + 1, y);
				}
				if (y + 1 < A.get(0).size()) {
					bfs(A, x, y + 1);
				}
			}
		}
	}
}
