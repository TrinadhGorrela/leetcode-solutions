/**
 * 997. FindTheTownJudge
 * Difficulty: Easy | Tags: Array, Hash Table, Graph
 * https://leetcode.com/problems/find-the-town-judge/
 *
 * Pattern: Graph
 * Key insight: Uses in-degree and out-degree to identify the judge in a directed graph.
 *
 * Time Complexity: O(N + E) - Iterates over people (N) and trust relationships (E)
 * Space Complexity: O(N) - Allocates an array that scales dynamically with input size
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class FindTheTownJudge {
    public int findJudge(int n, int[][] trust) {
        int[] inOrder = new int[n + 1];
        int[] outOrder = new int[n + 1];

        for (int[] i : trust) {
            inOrder[i[1]]++;
            outOrder[i[0]]++;
        }

        for (int i = 1; i <= n; i++) {
            if (inOrder[i] == n - 1 && outOrder[i] == 0) {
                return i;
            }
        }

        return -1;
    }
}
