public class Solution {
	public int climbStairs(int A) {
		if (A == 0) { return 0; }
		return climbStairsD(A);
	}

	public int climbStairsD(int A) {
		if (A == 0) { return 1; }
		if (A >= 2) {
			return climbStairs(A - 2) + climbStairs(A - 1);
		}
		return climbStairs(A - 1);
	}
}
