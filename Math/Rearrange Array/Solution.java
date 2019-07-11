public class Solution {
	/**
	 * A[i] = A[i] + A[A[i]] * N;
	 * A = B + C * N
	 * B = A % N; => original
	 */
	public void arrange(ArrayList<Integer> a) {
		int n = a.size();
		for (int i = 0; i < n; i++) {
			a.set(i, a.get(i) + a.get(a.get(i)) * n);
		}
		for (int i = 0; i < n; i++) {
			int original = a.get(i) % n;
			a.set(i, (a.get(i) - original) / n);
		}
	}
}
