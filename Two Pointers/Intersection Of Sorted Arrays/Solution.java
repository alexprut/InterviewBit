public class Solution {
	// DO NOT MODIFY THE LIST. IT IS READ ONLY
	public ArrayList<Integer> intersect(final List<Integer> A, final List<Integer> B) { // [100] [100]
		ArrayList<Integer> res = new ArrayList<Integer>();
		int i = 0;
		int j = 0;
		while (i < A.size() && j < B.size()) { // 0<1 0<1
			if (A.get(i) == B.get(j)) {
				res.add(A.get(i));
				i++;
				j++;
			} else if (A.get(i) < B.get(j)) {
				i++;
			} else {
				j++;
			}
		}
		return res;
	}
}
