/**
 * 991. Broken Calculator
 * Difficulty: Medium | Tags: Math, Greedy
 * https://leetcode.com/problems/broken-calculator/
 *
 * Pattern: Math
 * Key insight: Systematically processes the input relying on math principles.
 *
 * Time Complexity: O(log(target)) - Divides by 2 or adds 1, reaching startValue in log time
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class BrokenCalculator {
    public int brokenCalc(int startValue, int target) {
        int count = 0;
        while (target > startValue) {
            if (target % 2 == 0) {
                target /= 2;
            } else {
                target++;
            }
            count++;
        }

        count += startValue - target;
        return count;
    }
}
