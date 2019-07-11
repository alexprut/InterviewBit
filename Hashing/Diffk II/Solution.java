public class Solution {
	// DO NOT MODIFY THE LIST. IT IS READ ONLY
	public int diffPossible(final List<Integer> A, int B) {
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
		for (int i = 0; i < A.size(); i++) {
			if (map.containsKey(A.get(i))) {
				map.get(A.get(i)).add(i);
			} else {
				ArrayList<Integer> tmp = new ArrayList<>();
				tmp.add(i);
				map.put(A.get(i), tmp);
			}
		}
		for (int i = 0; i < A.size(); i++) {
			if (map.containsKey(A.get(i) + B)) {
				if (B == 0) {
					if (map.get(A.get(i)).size() > 1) {
						return 1;
					}
				} else {
					return 1;
				}
			}
		}
		return 0;
	}
}
