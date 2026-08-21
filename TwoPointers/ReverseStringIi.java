/**
 * 541. Reverse String II
 * Difficulty: Easy | Tags: Two Pointers, String
 * https://leetcode.com/problems/reverse-string-ii/
 *
 * Pattern: Two Pointers
 * Key insight: Systematically processes the input relying on two pointers principles.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(N) - Allocates memory for string processing
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class ReverseStringIi {
    public static String reverseStr(String s, int k) {
        char[] res = s.toCharArray();

        for (int i = 0; i < s.length(); i = i + 2 * k) {
            swap(res, i, Math.min(i + k - 1, s.length() - 1));
        }

        return new String(res);
    }

    public static void swap(char[] res, int st, int en) {
        while (st < en) {
            char temp = res[st];
            res[st] = res[en];
            res[en] = temp;
            st++;
            en--;
        }
    }
}
