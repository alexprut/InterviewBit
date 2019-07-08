/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
	public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
		intervals.sort(new Comparator<Interval>() {
			public int compare(Interval a, Interval b) {
				return (a.start < b.start) ? -1 : 1;
			}
		});
		if (intervals.size() < 2) {
			return intervals;
		}
		Interval current = intervals.get(0);
		ArrayList<Interval> res = new ArrayList<Interval>();
		for (int i = 1; i < intervals.size(); i++) {
			if (overlap(current, intervals.get(i))) {
				current.end = Math.max(intervals.get(i).end, current.end);
			} else {
				res.add(current);
				current = intervals.get(i);
			}
		}
		res.add(current);
		return res;
	}

	public boolean overlap(Interval a, Interval b) {
		return b.start <= a.end;
	}
}
