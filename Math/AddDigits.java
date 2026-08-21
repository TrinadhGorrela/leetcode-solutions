/**
 * 258. Add Digits
 * Difficulty: Easy | Tags: Math, Simulation, Number Theory
 * https://leetcode.com/problems/add-digits/
 *
 * Pattern: Math
 * Key insight: Systematically processes the input relying on math principles.
 *
 * Time Complexity: O(1) - Computes the result mathematically without any iteration
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class AddDigits {
    public int addDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return (num % 9 == 0) ? 9 : num % 9;
    }
}
