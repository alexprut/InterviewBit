public class Solution {
	// DO NOT MODIFY THE LIST
	public ArrayList<Integer> searchRange(final List<Integer> a, int b) {
		int start = 0;
		int end = a.size() - 1;
		int left = -1;
		int right = -1;
		while (start <= end) {
			int middle = (start + end) / 2;
			if (a.get(middle) == b) {
				end = middle - 1;
				left = middle;
			} else if (a.get(middle) < b) {
				start = middle + 1;
			} else {
				end = middle - 1;
			}
		}

		start = 0;
		end = a.size() - 1;
		while (start <= end) {
			int middle = (start + end) / 2;
			if (a.get(middle) == b) {
				start = middle + 1;
				right = middle;
			} else if (a.get(middle) < b) {
				start = middle + 1;
			} else {
				end = middle - 1;
			}
		}

		ArrayList<Integer> res = new ArrayList<Integer>();

		if (left != - 1 && a.get(left) == b) {
			res.add(left);
			res.add(right);
			return res;
		}
		res.add(-1);
		res.add(-1);
		return res;
	}
}
