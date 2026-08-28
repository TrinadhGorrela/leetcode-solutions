/**
 * 860. Lemonade Change
 * Difficulty: Easy | Tags: Array, Greedy
 * https://leetcode.com/problems/lemonade-change/
 *
 * Pattern: Array
 * Key insight: Systematically processes the input relying on array principles.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int five_count = 0;
        int ten_count = 0;
        for (int i : bills) {
            if (i == 5) {
                five_count++;
            } else if (i == 10) {
                ten_count++;
                if (five_count == 0) {
                    return false;
                }
                five_count--;
            } else {
                if (ten_count != 0 && five_count != 0) {
                    ten_count--;
                    five_count--;
                } else if (five_count >= 3) {
                    five_count -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
