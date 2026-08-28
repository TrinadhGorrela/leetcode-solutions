/**
 * 389. Find the Difference
 * Difficulty: Easy | Tags: Hash Table, String, Bit Manipulation, Sorting
 * https://leetcode.com/problems/find-the-difference/
 *
 * Pattern: Sum Difference (Bit Manipulation Alternative)
 * Key insight: Sum the ASCII values of t and subtract those of s; the leftover is the added character, since the target string holds exactly one extra char.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(N) - Allocates memory for string processing
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class FindTheDifference {
    public char findTheDifference(String s, String t) {

        int total = 0;

        for (char c : t.toCharArray()) {
            total += c;
        }

        for (char c : s.toCharArray()) {
            total -= c;
        }

        return (char) total;

    }
}
