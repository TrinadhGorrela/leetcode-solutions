/**
 * 1295. Find Numbers with Even Number of Digits
 * Difficulty: Easy | Tags: Array, Math
 * https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 *
 * Pattern: Array
 * Key insight: Systematically processes the input relying on array principles.
 *
 * Time Complexity: O(N log M) - M is max value, counting digits takes logarithmic time
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class FindNumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int res = 0;
        for (int i : nums) {
            if (helper(i) % 2 == 0) {
                res++;
            }
        }
        return res;
    }

    public static int helper(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }
}
