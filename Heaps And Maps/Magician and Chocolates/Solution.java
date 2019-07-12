public class Solution {
	public int nchoc(int A, ArrayList<Integer> B) {
		PriorityQueue<Integer> heap = new PriorityQueue<Integer>(new Comparator<Integer>() {
			public int compare(Integer a, Integer b) {
				return (a < b) ? 1 : -1;
			}
		});
	}
}
