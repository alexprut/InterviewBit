public class Solution {
	// DO NOT MODIFY THE LIST. IT IS READ ONLY
	public int singleNumber(final List<Integer> A) {
		int tmp = 0;
		for (int i = 0; i < A.size(); i++) {
			tmp ^= A.get(i);
		}
		return tmp;
	}
}