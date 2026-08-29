/**
 * 14. Longest Common Prefix
 * Difficulty: Easy | Tags: Array, String, Trie
 * https://leetcode.com/problems/longest-common-prefix/
 *
 * Pattern: Horizontal Scanning (String)
 * Key insight: Start with the first string as the prefix and repeatedly trim it by one character until it is a prefix of the current word; repeat across all words.
 *
 * Time Complexity: O(N * min(L)) - Total character comparisons bounded by shortest string
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: single string (returns it), no common prefix (empty result), empty string in list, repeated identical strings
 */
class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String t = strs[i];
            while (!t.startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}
