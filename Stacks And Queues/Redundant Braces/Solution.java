// ((()))
public class Solution {
	public int braces(String A) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < A.length(); i++) {
			if (A.charAt(i) == '(' || A.charAt(i) == '+' || A.charAt(i) == '-' || A.charAt(i) == '*' || A.charAt(i) == '/') {
				stack.push(A.charAt(i));
			} else {
				boolean changed = false;
				while (stack.peek() != '(') {
					stack.pop();
					changed = true;
				}
				if (!changed) {
					return 1;
				}
				stack.pop();
			}
		}
		return 0;
	}
}
