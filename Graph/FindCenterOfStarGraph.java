/**
 * 1791. Find Center of Star Graph
 * Difficulty: Easy | Tags: Graph Theory
 * https://leetcode.com/problems/find-center-of-star-graph/
 *
 * Pattern: Graph Theory
 * Key insight: Systematically processes the input relying on graph theory principles.
 *
 * Time Complexity: O(E) - Single pass over the edges array
 * Space Complexity: O(1) - Only a few variables for counting
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
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
