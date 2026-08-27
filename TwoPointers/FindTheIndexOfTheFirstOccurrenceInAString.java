/**
 * 28. Find the Index of the First Occurrence in a String
 * Difficulty: Easy | Tags: Two Pointers, String, String Matching, Z Algorithm, Knuth–Morris–Pratt Algorithm, Boyer–Moore String-Search Algorithm
 * https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
 *
 * Pattern: Two Pointers Brute Force
 * Key insight: Iterate through all possible starting indices in the haystack and compare characters sequentially until needle matches or mismatches.
 *
 * Time Complexity: O((N - M + 1) * M) - Nested comparison of needle length M for each starting index in haystack of length N
 * Space Complexity: O(1) - Uses only a constant number of integer index pointers
 *
 * Edge Cases Handled: Per LeetCode constraints
 */
class FindTheIndexOfTheFirstOccurrenceInAString {
    public int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) {
            return -1;
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                int s = i;
                int t = 0;

                while (s < haystack.length() && t < needle.length() && haystack.charAt(s) == needle.charAt(t)) {
                    s++;
                    t++;
                }

                if (t == needle.length()) {
                    return i;
                }
            }
        }

        return -1;
    }
}
