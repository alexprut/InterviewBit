public class Solution {
	public int maxSpecialProduct(ArrayList<Integer> A) {
		ArrayList<Integer> left = new ArrayList<Integer>();
		ArrayList<Integer> right = new ArrayList<Integer>();
		int max = 0;
		for (int i = 0; i < A.size(); i++) {
			if (i == 0) {
				left.add(0);
			} else {
				if (A.get(i - 1) > A.get(i)) {
					max = (i) % 1000000007;
				}
				left.add(max);
			}
		}
		max = 0;
		for (int i = A.size() - 1; i >= 0; i--) {
			if (i == A.size() - 1) {
				right.add(0);
			} else {
				if (A.get(i + 1) > A.get(i)) {
					max = (i + 1) % 1000000007;
				}
				right.add(max);
			}
		}
		max = 0;
		for (int i = 0; i < A.size(); i++) {
			max = Math.max(max, (left.get(i) * right.get(A.size() - i - 1)) % 1000000007);
		}
		return max;
	}
}
