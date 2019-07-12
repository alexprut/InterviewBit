public class Solution {
	public int canJump(ArrayList<Integer> A) {
		if (A.size() < 2) { return 1; }
		LinkedList<Integer> s = new LinkedList<>();
		s.add(0);
		boolean[] visited = new boolean[A.size()];
		visited[0] = true;
		while (s.size() > 0) {
			int i = s.pop();
			if (i + A.get(i) >= A.size() - 1) { return 1; }
			for (int k = i + 1; k <= i + A.get(i); k++) {
				if (!visited[k]) {
					s.add(k);
					visited[k] = true;
				}
			}
		}
		return 0;
	}
}