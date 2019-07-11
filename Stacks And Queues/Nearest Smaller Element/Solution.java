public class Solution {
	public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
		Stack<Integer> stack = new Stack<Integer>();
		ArrayList<Integer> res = new ArrayList<Integer>();
		for (int i = 0; i < A.size(); i++) {
			while (stack.size() > 0 && stack.peek() >= A.get(i)) {
				stack.pop();
			}
			if (stack.size() > 0) {
				res.add(stack.peek());
			} else {
				res.add(-1);
			}
			stack.push(A.get(i));
		}
		return res;
	}
}
