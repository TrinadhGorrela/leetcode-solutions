/**
 * 1833. Maximum Ice Cream Bars
 * Difficulty: Medium | Tags: Array, Greedy, Sorting, Counting Sort
 * https://leetcode.com/problems/maximum-ice-cream-bars/
 *
 * Pattern: Greedy + Sorting
 * Key insight: To maximize the count, buy the cheapest bars first; sort costs ascending and deduct until coins run out.
 *
 * Time Complexity: O(N log N) - Dominated by the sorting operation on the input array
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class MaximumIceCreamBars {
    public int maxIceCream(int[] costs, int coins) {
        int count = 0;
        Arrays.sort(costs);
        for (int i : costs) {
            if (coins >= i) {
                coins -= i;
                count++;
            }
        }
        return count;
    }
}
