public class Solution {
	public int findMinXor(ArrayList<Integer> A) {
		Collections.sort(A);
		int min = Integer.MAX_VALUE;
		for (int i = 1; i < A.size(); i++) {
			min = Math.min(min, A.get(i - 1) ^ A.get(i));
		}
		return min;
	}
}