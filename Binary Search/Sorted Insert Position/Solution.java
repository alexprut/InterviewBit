public class Solution {
	public int searchInsert(ArrayList<Integer> a, int b) {
		int start = 0;
		int end = a.size() - 1;
		int middle = (start + end) / 2;
		while (start <= end) {
			int middle = (start + end) / 2;
			if (a.get(middle) == b) { return middle; }
			if (a.get(middle) < b) {
				start = middle + 1;
			} else {
				end = middle - 1;
			}
		}
		if (start == 0) {

		}
	}
}
