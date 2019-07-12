public class Solution {
	public int black(ArrayList<String> A) {
		int counter = 0;
		if (A.size() == 0) { return counter; }
		boolean[][] visited = new boolean[A.size()][A.get(0).length()];
		for (int i = 0; i < A.size(); i++) {
			for (int j = 0; j < A.get(i).length(); j++) {
				if (!visited[i][j] && A.get(i).charAt(j) == 'X') {
					dfs(visited, i, j, A);
				}
				counter++;
			}
		}

		return counter;
	}

	public void dfs(boolean[][] visited, int i, int j, ArrayList<String> A) {
		class Pair {
			int i; int j;
			Pair(int i, int j) {
				this.i = i;
				this.j = j;
			}
		}
		LinkedList<Pair> stack = new LinkedList<>();
		stack.add(new Pair(i, j));
		while (stack.size() > 0) {
			Pair c = stack.pop();
			visited[c.i][c.j] = true;
			if (c.i - 1 >= 0 &&
					!visited[c.i - 1][c.j] &&
					A.get(c.i - 1).charAt(c.j) == 'X') {
				stack.add(new Pair(c.i - 1, c.j));
			}
			if (c.j - 1 >= 0 && !visited[c.i][c.j - 1] &&
					A.get(c.i).charAt(c.j - 1) == 'X') {
				stack.add(new Pair(c.i,c. j - 1));
			}
			if (c.i + 1 < A.size() &&
					!visited[c.i + 1][c.j] &&
					A.get(c.i + 1).charAt(c.j) == 'X') {
				stack.add(new Pair(c.i + 1, c.j));
			}
			if (c.j + 1 < A.get(c.i).length() && !visited[c.i][c.j + 1] &&
					A.get(c.i).charAt(c.j + 1) == 'X') {
				stack.add(new Pair(c.i, c.j + 1));
			}
		}
	}
}
