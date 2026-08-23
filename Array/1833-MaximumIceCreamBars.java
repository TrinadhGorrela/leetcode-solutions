/**
 * 1833. Maximum Ice Cream Bars
 * Difficulty: Medium | Tags: Array, Greedy, Sorting, Counting Sort
 * https://leetcode.com/problems/maximum-ice-cream-bars/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
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
