/**
 * 57. Insert Interval
 * Difficulty: Medium | Tags: Array
 * https://leetcode.com/problems/insert-interval/
 *
 * Pattern: Intervals (Linear Merge)
 * Key insight: Walk the sorted intervals in three phases: add all intervals ending before the new interval, merge all overlapping ones into the new interval, then append the remaining intervals.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
 * Edge Cases Handled: empty intervals list, new interval before all / after all, exact overlap boundaries, full containment
 */
class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        int in = 0;
        while (in < intervals.length && intervals[in][1] < newInterval[0]) {
            list.add(intervals[in++]);
        }
        while (in < intervals.length && intervals[in][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[in][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[in++][1]);
        }

        list.add(newInterval);

        while (in < intervals.length) {
            list.add(intervals[in++]);
        }

        return list.toArray(new int[list.size()][]);
    }
}
