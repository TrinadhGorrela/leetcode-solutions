/**
 * 1288. Remove Covered Intervals
 * Difficulty: Medium | Tags: Array, Sorting
 * https://leetcode.com/problems/remove-covered-intervals/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
 */
class RemoveCoveredIntervals {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(b[1], a[1]);
            }
            return Integer.compare(a[0], b[0]);
        });
        int n = intervals.length;
        int t = 0;
        for (int i = 1; i < intervals.length; i++) {
            int[] temp = intervals[t];
            int[] curr = intervals[i];
            if (temp[0] <= curr[0] && temp[1] >= curr[1]) {
                n--;
            } else {
                t = i;
            }
        }
        return n;
    }
}
