public class Solution {
	public int mice(ArrayList<Integer> A, ArrayList<Integer> B) {
		int max = Integer.MAX_VALUE;
		Collections.sort(A); Collections.sort(B);
		for (int i = 0; i < A.size(); i++) {
			max = Math.max(max, Math.abs(A.get(i) - B.get(i)))
		}
	}
}
