public class Solution {
	public int diffPossible(ArrayList<Integer> A, int B) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < A.size(); i++) {
			int f = Math.abs(A.get(i) + B);
			if (set.contains(f)) { return 1; }
			set.add(A.get(i));
		}
		return 0;
	}
}
