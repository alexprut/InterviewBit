public class Solution {
	public ArrayList<Integer> solve(int A, int B, int C, int D) {
		ArrayList<Integer> res = new ArrayList<>();
		PriorityQueue<Integer> q = new PriorityQueue<>();
		q.add(A); q.add(B); q.add(C);
		while (q.size() != 0 && D > 0) {
			int tmp = q.poll();
			q.add(tmp * A); q.add(tmp * B); q.add(tmp * C);
			if (res.size() == 0) { res.add(tmp); D--; }
			else if (res.size() != 0 && res.get(res.size() - 1) != tmp) {
				res.add(tmp);
				D--;
			}
		}
		return res;
	}
}
