public class Solution {
	public ArrayList<String> generateParenthesis(int A) {
		if (A == 0) { return new ArrayList<String>(); }
		ArrayList<String> res = new ArrayList<String>();
		char[] elem = new char[A * 2];
		gen(res, A, A, elem, 0);
		return res;
	}

	public void gen(ArrayList<String> list, int left, int right, char[] elem, int index) {
		if (left < 0 || left > right) { return; }
		if (left == 0 && right == 0) { list.add(String.copyValueOf(elem)); return; }
		elem[index] = '(';
		gen(list, left - 1, right, elem, index + 1);

		elem[index] = ')';
		gen(list, left, right - 1, elem, index + 1);
	}
}
