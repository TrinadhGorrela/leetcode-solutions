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
        int f = 0;
        int ten = 0;
        int twe = 0;
        for (int i : bills) {
            if (i == 5) {
                f++;
            } else if (i == 10) {
                ten++;
                if (f == 0) {
                    return false;
                }
                f--;
            } else {
                if (ten != 0 && f != 0) {
                    ten--;
                    f--;
                } else if (f >= 3) {
                    f -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
