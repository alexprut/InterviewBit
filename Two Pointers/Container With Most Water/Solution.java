public class Solution {
	public int maxArea(ArrayList<Integer> A) {
		int i = 0; int j = A.size() - 1;
		int m = (j - i) * Math.min(A.get(i), A.get(j));
		while (i < j) {
			m = Math.max(m, (j - i) * Math.min(A.get(i), A.get(j)));
			if (A.get(i) < A.get(j)) {
				i++;
			} else {
				j--;
			}
		}
		return m;
	}
}
