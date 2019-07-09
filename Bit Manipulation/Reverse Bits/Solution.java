public class Solution {
	public long reverse(long a) {
		String tmp = Long.toBinaryString(a);
		for (int i = 0; i < 32 - tmp.length(); i++) {
			tmp = "0" + tmp;
		}
		tmp = new StringBuilder(tmp).reverse().toString();
		return Long.parseLong(tmp, 2);
	}
}
