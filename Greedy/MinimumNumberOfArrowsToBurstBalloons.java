/**
 * 452. Minimum Number of Arrows to Burst Balloons
 * Difficulty: Medium | Tags: Array, Greedy, Sorting
 * https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/
 *
 * Pattern: Greedy + Sorting (Interval Scheduling)
 * Key insight: Sort balloons by end coordinate; shoot at the earliest ending balloon's end and count a new arrow only when the next balloon starts after the current arrow position.
 *
 * Time Complexity: O(N log N) - Dominated by the sorting operation on the input array
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class MinimumNumberOfArrowsToBurstBalloons {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int last = points[0][1];
        int arrows = 1;

        for (int i = 0; i < points.length; i++) {
            if (last < points[i][0]) {
                arrows++;
                last = points[i][1];
            }
        }
        return arrows;
    }
}
