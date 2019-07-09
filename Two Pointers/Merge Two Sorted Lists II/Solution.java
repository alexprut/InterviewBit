public class Solution {
	public void merge(ArrayList<Integer> a, ArrayList<Integer> b) { // a[-4,3] b[-2,-2]
		ArrayList<Integer> res = new ArrayList<>();
		int ai = 0;
		int bi = 0;
		for (int i = 0; i < a.size() + b.size(); i++) { // i=0,1
			if (ai >= a.size()) { // 0,1 >= 2
				res.add(b.get(bi));
				bi++; //
			} else if (bi >= b.size()) { // 0,1 >= 2
				res.add(a.get(ai));
				ai++; //
			} else {
				if (a.get(ai) <= b.get(bi)) { // -4<-2
					res.add(a.get(ai));
					ai++; // ai=1
				} else {
					res.add(b.get(bi));
					bi++; //
				}
			}
		}
		a.clear();
		for (int i = 0; i < res.size(); i++) {
			a.add(res.get(i));
		}
	}
}
