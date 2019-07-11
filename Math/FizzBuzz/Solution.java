public class Solution {
	public ArrayList<String> fizzBuzz(int A) {
		ArrayList<String> res = new ArrayList<String>();
		for (int i = 0; i < A; i++) {
			if ((i + 1) % 3 == 0) {
				res.add("Fizz");
			} else if ((i + 1) % 5 == 0) {
				res.add("Buzz");
			} else {
				res.add((i + 1) + "");
			}
		}
		return res;
	}
}
