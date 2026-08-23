/**
 * 1029. Two City Scheduling
 * Difficulty: Medium | Tags: Array, Greedy, Sorting, Hungarian Algorithm, Successive Shortest Path Algorithm
 * https://leetcode.com/problems/two-city-scheduling/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
 */
class TwoCityScheduling {
    public int twoCitySchedCost(int[][] costs) {
        int[][] sch = new int[costs.length][3];

        for (int i = 0; i < costs.length; i++) {
            sch[i][0] = costs[i][0];
            sch[i][1] = costs[i][1];
            sch[i][2] = costs[i][0] - costs[i][1];
        }

        Arrays.sort(sch, (a, b) -> a[2] - b[2]);
        int res = 0;

        for (int i = 0; i < costs.length / 2; i++) {
            res += sch[i][0];
        }

        for (int i = costs.length / 2; i < costs.length; i++) {
            res += sch[i][1];
        }

        return res;
    }
}
