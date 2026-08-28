/**
 * 435. Non-overlapping Intervals
 * Difficulty: Medium | Tags: Array, Dynamic Programming, Greedy, Sorting
 * https://leetcode.com/problems/non-overlapping-intervals/
 *
 * Pattern: Sorting + Greedy (Intervals)
 * Key insight: Sort by end time and greedily keep intervals that do not overlap the last kept interval; the number of removals is total minus kept.
 *
 * Time Complexity: O(N log N) - Dominated by the sorting operation on the input array
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class NonOverlappingIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int last = intervals[0][1];
        int res = 1;
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][0] >= last) {
                res++;
                last = intervals[i][1];
            }
        }
        return intervals.length - res;
    }
}
