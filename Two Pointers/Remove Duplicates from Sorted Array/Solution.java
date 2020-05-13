public class Solution {
	public int removeDuplicates(ArrayList<Integer> a) {
		int i = 0;
		for (int j = 1; j < a.size(); j++)
			if (!a.get(i).equals(a.get(j)))
				a.set(++i, a.get(j));
		while (a.size() > i + 1)
			a.remove(a.size() - 1);
		return a.size();
	}
}
