public class Solution {
	public int numSetBits(long a) {
		String tmp = Long.toBinaryString(a);
		int counter = 0;
		for (int i = 0; i < tmp.length(); i++) {
			if (tmp.charAt(i) == '1') {
				counter++;
			}
		}
		return counter;
	}
}