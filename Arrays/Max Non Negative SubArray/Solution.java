public class Solution {
	public int[] maxset(int[] A) { // [1,2,-1,-1]
		int i = 0; //
		int j = -1; //
		long sum = -1; //

		int cI = 0; //
		int cJ = -1; //
		long cSum = 0; //

		for (int t = 0; t < A.length; t++) { // t=0,1,2,3
			if (A[t] >= 0) {
				cSum += A[t]; // cSum=1,3
				cJ = t; // cJ=0,1
			} else {
				if (cI <= cJ && sum < cSum) {
					i = cI; // i=0
					j = cJ; // j=1
					sum = cSum; // sum=3
				}
				cSum = 0; // cSum=0,0
				cI = t + 1; // cI=3,4
			}
		}

		if (cI <= cJ && sum < cSum) {
			i = cI;
			j = cJ;
		}

		if (i > j) {
			return new int[] {};
		}

		int[] result = new int[j - i + 1];
		for (int t = i; t <= j; t++) {
			result[t - i] = A[t];
		}
		return result;
	}
}
