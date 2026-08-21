/**
 * 389. Find the Difference
 * Difficulty: Easy | Tags: Hash Table, String, Bit Manipulation, Sorting
 * https://leetcode.com/problems/find-the-difference/
 *
 * Pattern: Hash Table
 * Key insight: Systematically processes the input relying on hash table principles.
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
