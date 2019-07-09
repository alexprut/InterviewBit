public class Solution {
	public void sortColors(ArrayList<Integer> a) {
		int r0 = 0;
		int w1 = 0;
		int b2 = 0;
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) == 0) {
				r0++;
			} else if (a.get(i) == 1) {
				w1++;
			} else {
				b2++;
			}
		}
		a.clear();
		int i = 0;
		while (i < i + r0) {
			a.add(0);
			i++;
		}
		while (i < i + w1) {
			a.add(1);
			i++;
		}
		while (i < i + b2) {
			a.add(2);
			i++;
		}
	}
}
