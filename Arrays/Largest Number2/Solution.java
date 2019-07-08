public class Solution {
	// DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
	public String largestNumber(final int[] A) {
		TreeSet<String> set = new TreeSet<>((Comparator<String>) (a, b) -> {
			String tmpA = a+b;
			String tmpB = b+a;
			return tmpA.compareTo(tmpB);
		});
		for (int i = 0; i < A.length; i++) {
			set.add(String.valueOf(A[i]));
		}
		StringBuilder tmp = new StringBuilder();
		while (set.size() > 0) {
			tmp.append(set.pollLast());
		}
		return tmp.toString();
	}
}
