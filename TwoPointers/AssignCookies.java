/**
 * 455. Assign Cookies
 * Difficulty: Easy | Tags: Array, Two Pointers, Greedy, Sorting, Quicksort
 * https://leetcode.com/problems/assign-cookies/
 *
 * Pattern: Array
 * Key insight: Systematically processes the input relying on array principles.
 *
 * Time Complexity: O(N log N) - Dominated by the sorting operation on the input array
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        int left = 0;
        int right = 0;
        int count = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        while (left < g.length && right < s.length) {
            if (g[left] <= s[right]) {
                count++;
                left++;
                right++;
            } else {
                right++;
            }
        }
        return count;
    }
}
