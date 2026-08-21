/**
 * 57. Insert Interval
 * Difficulty: Medium | Tags: Array
 * https://leetcode.com/problems/insert-interval/
 *
 * Pattern: Array
 * Key insight: Systematically processes the input relying on array principles.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
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
