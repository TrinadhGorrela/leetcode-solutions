/**
 * 56. Merge Intervals
 * Difficulty: Medium | Tags: Array, Sorting, Quicksort
 * https://leetcode.com/problems/merge-intervals/
 *
 * Pattern: Sorting + Intervals (Greedy)
 * Key insight: Sort intervals by start time, then merge overlapping ones by extending the last interval's end; otherwise append the current interval.
 *
 * Time Complexity: O(N log N) - Dominated by the sorting operation on the input array
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> res = new ArrayList<>();
        res.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            int[] last = res.get(res.size() - 1);
            int[] cur = intervals[i];
            if (last[1] >= cur[0]) {
                last[1] = Math.max(last[1], cur[1]);
            } else {
                res.add(cur);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
