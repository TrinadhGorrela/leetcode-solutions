/**
 * 997. Find the Town Judge
 * Difficulty: Easy | Tags: Array, Hash Table, Graph Theory
 * https://leetcode.com/problems/find-the-town-judge/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
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
