/**
 * ()
 *
 * (1)
 *
 * (2)
 * (1,2)
 *
 * (3)
 * (1,3)
 * (2,3)
 * (1,2,3)
 */
public class Solution {
	public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		res.add(new ArrayList<Integer>());
		for (int i = 0; i < A.size(); i++) {
			ArrayList<ArrayList<Integer>> tmp = ArrayList<ArrayList<Integer>>(res);
			for (int j = 0; j < tmp.size(); j++) {
				tmp.get(j).add(A.get(i));
			}
			res.addAll(tmp);
		}
		Collections.sort(res, new Comparator<>)
	}
}
