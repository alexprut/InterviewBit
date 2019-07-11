public class Solution {
	public ArrayList<ArrayList<Integer>> sol = new ArrayList<ArrayList<Integer>>();

	public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
		per(new ArrayList<Integer>(), A);
		return sol;
	}

	public void per(ArrayList<Integer> current, ArrayList<Integer> rem) {
		if (rem.size() == 0) { sol.add(current); return; }
		for (int i = 0; i < rem.size(); i++) {
			ArrayList<Integer> cTmp = (ArrayList<Integer>) current.clone();
			ArrayList<Integer> cRem = (ArrayList<Integer>) rem.clone();
			cTmp.add(cRem.get(i));
			cRem.remove(i);
			per(cTmp, cRem);
		}
	}
}