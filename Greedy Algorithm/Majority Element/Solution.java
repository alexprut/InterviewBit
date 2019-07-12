public class Solution {
	// DO NOT MODIFY THE LIST. IT IS READ ONLY
	public int majorityElement(final List<Integer> A) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int maj = A.size() / 2;
		for (int i = 0; i < A.size(); i++) {
			if (map.containsKey(A.get(i))) {
				map.put(A.get(i), map.get(A.get(i)) + 1);
			} else {
				map.put(A.get(i), 1);
			}
			if (map.get(A.get(i)) >= maj) {
				return A.get(i);
			}
		}
		return -1;
	}
}
