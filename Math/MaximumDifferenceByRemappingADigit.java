/**
 * 2566. Maximum Difference by Remapping a Digit
 * Difficulty: Easy | Tags: Math, Greedy
 * https://leetcode.com/problems/maximum-difference-by-remapping-a-digit/
 *
 * Pattern: Greedy (Digit Remapping)
 * Key insight: Remap the first digit that is not 9 to 9 for the maximum, and remap the leading digit to 0 for the minimum; subtract the two results.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(N) - Creates string copies for remapping
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
