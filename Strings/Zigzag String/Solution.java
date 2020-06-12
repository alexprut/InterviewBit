/**
 * PAYPALISHIRING => PAHNAPLSIIGYIR
 *
 * P.......A........H.......N
 * ..A..P....L....S....I...I....G
 * ....Y.........I........R
 *
 * P A Y P A L I S H I R  I  N  G
 * 0 1 2 3 4 5 6 7 8 9 10 11 12 13
 *
 * P A Y P A L I S H I R I N G
 * 0 1 2 1 0 1 2 1 0 1 2 1 0 1
 *
 * isUp = up or down
 *
 *
 *
 */
public class Solution {
	public String convert(String A, int B) {
		if (B == 1) {
			return A;
		}
		String[] tmp = new String[B];
		for (int i = 0; i < tmp.length; i++) {
			tmp[i] = "";
		}
		boolean isUp = true;
		int c = 0;
		for (int i = 0; i < A.length(); i++) {
			tmp[c] += A.charAt(i);
			c = (isUp) ? c + 1: c - 1;
			if (c == B) {
				isUp = false;
				c--; c--;
			}
			if (c == -1) {
				isUp = true;
				c++; c++;
			}
		}
		String res = "";
		for (int i = 0; i < tmp.length; i++) {
			res += tmp[i];
		}
		return res;
	}
}
