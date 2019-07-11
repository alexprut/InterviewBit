public class Solution {
	public int lengthOfLongestSubstring(String A) {
		if (A.length() == 0) { return 0; }
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int max = Integer.MIN_VALUE;
		int curL = 0;
		int prevViol = Integer.MAX_VALUE;
		for (int i = 0; i < A.length(); i++) {
			char c = A.charAt(i);
			if (!map.containsKey(c) || (map.containsKey(c) && map.get(c) < prevViol)) {
				map.put(c, i);
				curL++;
			} else {
				max = Math.max(max, curL);
				prevViol = map.get(c);
				curL = i - prevViol;
				map.put(c, i);
			}
		}
		max = Math.max(max, curL);
		return max;
	}
}
