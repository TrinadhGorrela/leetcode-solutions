/**
 * 125. Valid Palindrome
 * Difficulty: Easy | Tags: Two Pointers, String
 * https://leetcode.com/problems/valid-palindrome/
 *
 * Pattern: Two Pointers
 * Key insight: Systematically processes the input relying on two pointers principles.
 *
 * Time Complexity: O(N) - Two pointers approach iterating through elements once
 * Space Complexity: O(N) - Allocates new strings during processing
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String res = s.toLowerCase();
        String a = res.replaceAll("[^a-z0-9]", "");
        String b = new StringBuilder(a).reverse().toString();
        return a.equals(b);
    }
}
