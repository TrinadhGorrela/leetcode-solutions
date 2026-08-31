/**
 * 541. Reverse String II
 * Difficulty: Easy | Tags: Two Pointers, String
 * https://leetcode.com/problems/reverse-string-ii/
 *
 * Pattern: 2k-Chunked Two-Pointer Reversal
 * Key insight: Iterate in steps of 2k; within each block, reverse only the first min(k, remaining) chars via a two-pointer swap from each chunk's boundaries—no extra buffers needed.
 *
 * Time Complexity: O(N) - Each character is swapped at most once; outer loop jumps in 2k increments
 * Space Complexity: O(N) - char[] copy required for in-place swaps (Java Strings immutable)
 *
 * Edge Cases Handled: k >= string length (whole string reversed), last chunk shorter than k (Math.min clamps boundary), empty string, k = 1 (every other char reversed)
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
