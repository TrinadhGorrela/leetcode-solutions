/**
 * 57. Insert Interval
 * Difficulty: Medium | Tags: Array
 * https://leetcode.com/problems/insert-interval/
 *
 * Pattern: Three-Phase Linear Interval Merge
 * Key insight: The three while-loops partition the problem cleanly: (1) copy non-overlapping before, (2) absorb all
 * overlapping intervals by expanding newInterval's bounds, (3) copy non-overlapping after — each interval is touched at
 * most once.
 *
 * Time Complexity: O(N) - Single pass through the sorted intervals array
 * Space Complexity: O(N) - Output list holds all intervals (up to N + 1 after insertion)
 *
 * Edge Cases Handled: empty intervals list, newInterval completely before or after all existing intervals, exact
 * boundary touches (start == end), newInterval fully contained within an existing interval
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
