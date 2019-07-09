public class Solution {
	// DO NOT MODIFY THE LIST
	public int search(final List<Integer> a, int b) {
		int pivot = bsPivot(a, b, 0, a.size() - 1);
		if (pivot == 0) { return bs(a, b, 0, a.size() - 1); }
		if (a.get(0) <= b && b <= a.get(pivot - 1)) {
			return bs(a, b, 0, pivot - 1);
		}
		return bs(a, b, pivot, a.size() - 1);
	}

	public int bs(final List<Integer> a, int b, int start, int end) {
		while (start < end) {
			int middle = (start + end) / 2;
			if (a.get(middle) == b) {
				return middle;
			} else if (a.get(middle) < b) {
				start = middle + 1;
			} else {
				end = middle - 1;
			}
		}
		return -1;
	}

	public int bsPivot(final List<Integer> a, int b, int start, int end) {
		while (start < end) {
			int middle = (start + end) / 2;
			if (a.get(start) <= a.get(middle) && a.get(middle) <= a.get(end)) { return start; }
			if (a.get(start) > a.get(middle)) {
				end = middle;
			} else {
				start = middle + 1;
			}
		}
		return 0;
	}
}

