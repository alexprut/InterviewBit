public class Solution {
	public ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
		if (A.size() < B || B == 0) { return new ArrayList<Integer>(); }

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < B; i++) {
			if (map.containsKey(A.get(i))) {
				map.put(A.get(i), map.get(A.get(i)) + 1);
			} else {
				map.put(A.get(i), 1);
			}
		}
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.add(map.size());
		for (int i = B; i < A.size(); i++) {
			if (map.get(A.get(i - 1)) > 1) {
				map.put(A.get(i - 1), map.get(A.get(i - 1)) - 1);
			} else {
				map.remove(A.get(i - 1));
			}
		}
	}
}
