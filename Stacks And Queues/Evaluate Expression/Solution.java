public class Solution {
	public int evalRPN(ArrayList<String> A) {
		if (A.size() == 0) {
			return 0;
		}

		Stack<Integer> stack = new Stack<Integer>();

		for (int i = 0; i < A.size(); i++) {
			Character c = A.get(i).charAt(0);
			if (c == '/') {
				int second = stack.pop();
				int first = stack.pop();
				stack.push(first / second);
			} else if (c == '+') {
				stack.push(stack.pop() + stack.pop());
			} else if (c == '*') {
				stack.push(stack.pop() * stack.pop());
			} else if (c == '-') {
				if (stack.size() == 1) {
					stack.push(- stack.pop());
				} else {
					int second = stack.pop();
					int first = stack.pop();
					stack.push(first - second);
				}
			} else {
				stack.push(Integer.parseInt(A.get(i)));
			}
		}

		return stack.pop();
	}
}
