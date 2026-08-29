/**
 * 541. Reverse String II
 * Difficulty: Easy | Tags: Two Pointers, String
 * https://leetcode.com/problems/reverse-string-ii/
 *
 * Pattern: Two Pointers (Chunked Reversal)
 * Key insight: Step through the array in 2k blocks, reversing only the first k characters of each block (bounded by the array end on the last chunk).
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(N) - Allocates memory for string processing
 *
 * Edge Cases Handled: Empty string, k larger than string length (whole string reversed), last partial chunk shorter than k bounded by array end
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
