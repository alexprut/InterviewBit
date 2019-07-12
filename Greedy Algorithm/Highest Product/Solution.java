public class Solution {
	public int maxp3(ArrayList<Integer> A) {
		Collections.sort(A);
		if (A.get(0) * A.get(1) > A.get(A.size() - 1) * A.get(A.size() - 2)) {
			if ()
				return A.get(0) * A.get(1) * A.get(A.size() - 1);
		}
		return A.get(A.size() - 1) * A.get(A.size() - 2) * A.get(A.size() - 3);
	}
}
