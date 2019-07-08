public class Solution {
	// DO NOT MODIFY THE LIST
	public int repeatedNumber(final List<Integer> a) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < a.size(); i++) {
			if (set.contains(a.get(i))) {
				return a.get(i);
			} else {
				set.add(a.get(i));
			}
		}
		return -1;
	}
}