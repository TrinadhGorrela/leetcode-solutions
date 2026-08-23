/**
 * 1791. Find Center of Star Graph
 * Difficulty: Easy | Tags: Graph Theory
 * https://leetcode.com/problems/find-center-of-star-graph/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
 */
class FindCenterOfStarGraph {
    public int findCenter(int[][] edges) {
        int s = edges[0][0];
        int t = edges[0][1];

        int countS = 0;
        int countT = 0;

        for (int[] edge : edges) {
            if (edge[0] == s || edge[1] == s) {
                countS++;
            }

            if (edge[0] == t || edge[1] == t) {
                countT++;
            }
        }

        if (countS > countT) {
            return s;
        }

        return t;
    }
}
