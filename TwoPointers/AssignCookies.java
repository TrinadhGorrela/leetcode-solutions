/**
 * 455. Assign Cookies
 * Difficulty: Easy | Tags: Array, Two Pointers, Greedy, Sorting, Quicksort
 * https://leetcode.com/problems/assign-cookies/
 *
 * Pattern: Sorting + Two Pointers (Greedy Matching)
 * Key insight: Sort greediness and cookie sizes; advance the cookie pointer until it satisfies the current child's greed, counting each matched pair (a child never goes backwards).
 *
 * Time Complexity: O(N log N) - Dominated by the sorting operation on the input array
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Empty greed or sizes array (result 0), no cookie large enough for any child, all children satisfied, extra oversized cookies left unused
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
