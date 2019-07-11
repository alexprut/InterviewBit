public class Solution {
	// DO NOT MODIFY THE LIST. IT IS READ ONLY
	public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
		LinkedHashMap<String, ArrayList<Integer>> map = new LinkedHashMap<>();
		for (int i = 0; i < A.size(); i++) {
			char[] tempArray = A.get(i).toCharArray();
			Arrays.sort(tempArray);
			String tmp = new String(tempArray);
			if (map.containsKey(tmp)) {
				map.get(tmp).add(i);
			} else {
				ArrayList<Integer> tmp2 = new ArrayList<Integer>();
				tmp2.add(i);
				map.put(tmp, tmp2);
			}
		}
		return (ArrayList<ArrayList<Integer>>) map.values();
	}
}
