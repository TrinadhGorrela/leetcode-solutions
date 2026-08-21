/**
 * 2566. Maximum Difference by Remapping a Digit
 * Difficulty: Easy | Tags: Math, Greedy
 * https://leetcode.com/problems/maximum-difference-by-remapping-a-digit/
 *
 * Pattern: Math
 * Key insight: Systematically processes the input relying on math principles.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class MaximumDifferenceByRemappingADigit {
    public int minMaxDifference(int num) {
        String a = Integer.toString(num);
        String b = a;
        int i = 0;
        while (i < a.length() && a.charAt(i) == '9') {
            i++;
        }
        if (i < a.length()) {
            a = a.replace(a.charAt(i), '9');
        }
        b = b.replace(b.charAt(0), '0');
        return Integer.parseInt(a) - Integer.parseInt(b);
    }
}
