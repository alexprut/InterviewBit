/**
 * Chars: I - 1   V - 5   X - 10   L - 50    C - 100    D - 500    M - 1000
 */
public class Solution {
	public int romanToInt(String A) {
		int counter = 0;
		for (int i = 0; i < A.length(); i++) {
			if (i == 0) {
				counter += decode(A.charAt(i));
			} else {
				if (decode(A.charAt(i)) > decode(A.charAt(i-1))) {
					counter -= decode(A.charAt(i-1));
					counter += (decode(A.charAt(i)) - decode(A.charAt(i-1)));
				}
			}
		}
		return counter;
	}

	public int decode(char a) {
		switch(a) {
			case 'I':
				return 1;
			case 'V':
				return 5;
			case 'X':
				return 10;
			case 'L':
				return 50;
			case 'C':
				return 100;
			case 'D':
				return 500;
			case 'M':
				return 1000;
			default:
				return -1;
		}
	}
}
