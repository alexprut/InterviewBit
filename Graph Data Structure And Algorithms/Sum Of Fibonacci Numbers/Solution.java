public class Solution {
	public int fibsum(int A) {
		if (A < 2) { return A; }
		TreeSet<Integer> fib = new TreeSet<Integer>();
		fib.add(0); fib.add(1);
		int left = 0;
		int right = 1;
		int current = 0;
		for (int i = 2; current <= A; i++) {
			current = left + right;
			left = right;
			right = current;
			if (current <= A) {
				fib.add(current);
			}
		}
		int counter = 0;
		while (A > 0 && fib.size() > 0) {
			int c = fib.pollLast();
			int tmp = A / c;
			A -= (tmp * c);
			counter += tmp;
		}

		return counter;
	}
}
