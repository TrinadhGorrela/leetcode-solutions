/**
 * 125. Valid Palindrome
 * Difficulty: Easy | Tags: Two Pointers, String
 * https://leetcode.com/problems/valid-palindrome/
 *
 * Pattern: Sanitization + Reverse Comparison
 * Key insight: Strip non-alphanumeric characters and lowercase the remainder, then compare the result with its reverse; equality means a valid palindrome.
 *
 * Time Complexity: O(N) - Two pointers approach iterating through elements once
 * Space Complexity: O(N) - Allocates new strings during processing
 *
 * Edge Cases Handled: Empty string, single character, mixed uppercase/lowercase, non-alphanumeric characters (punctuation, spaces) stripped out
 */
class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String res = s.toLowerCase();
        String a = res.replaceAll("[^a-z0-9]", "");
        String b = new StringBuilder(a).reverse().toString();
        return a.equals(b);
    }
}
