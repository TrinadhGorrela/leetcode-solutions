/**
 * 9. Palindrome Number
 * Difficulty: Easy | Tags: Math
 * https://leetcode.com/problems/palindrome-number/
 *
 * Pattern: Reverse-and-Compare
 * Key insight: Rebuild the number's digits in reverse order and compare with the original; negatives are automatically not palindromes.
 *
 * Time Complexity: O(log n) - Processes the digits of the number
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int a;
        int sum = 0;
        int b = x;
        if (x > -1) {

            while (x != 0) {
                a = x % 10;
                sum = sum * 10 + a;
                x = x / 10;
            }
            if (b == sum) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
