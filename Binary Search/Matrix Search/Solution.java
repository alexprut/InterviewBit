public class Solution {
	public int searchMatrix(ArrayList<ArrayList<Integer>> A, int B) {
		int i = bsA(A, B);
		if (i < 0) {
			return 0;
		}
		return bs(A.get(i), B) != -1 ? 1 : 0;
	}

	public static int bs(ArrayList<Integer> a, int v) {
		int start = 0;
		int end = a.size() - 1;

		while (start <= end) {
			int middle = start + (end - start) / 2;
			if (a.get(middle) == v) {
				return middle;
			}

			if (a.get(middle) > v) {
				end = middle - 1;
			} else {
				start = middle + 1;
			}
		}
		return -1;
	}

	public static int bsA(ArrayList<ArrayList<Integer>> a, int v) {
		int start = 0;
		int end = a.size() - 1;

		while (start <= end) {
			int middle = start + (end - start) / 2;
			if (a.get(middle).get(0) == v) {
				return middle;
			}

			if (a.get(middle).get(0) > v) {
				end = middle - 1;
			} else {
				start = middle + 1;
			}
		}
		return end;
	}
}
