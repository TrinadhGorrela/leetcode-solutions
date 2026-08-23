/**
 * 1295. Find Numbers with Even Number of Digits
 * Difficulty: Easy | Tags: Array, Math
 * https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
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
