/**
 * 3702. Longest Subsequence With Non-Zero Bitwise XOR
 * Difficulty: Medium | Tags: Array, Bit Manipulation
 * https://leetcode.com/problems/longest-subsequence-with-non-zero-bitwise-xor/
 *
 * Pattern: Bit Manipulation / Math
 * Key insight: XOR the whole array; if the total XOR is non-zero take every element, otherwise drop exactly one element (unless all are zeros, yielding 0) so the XOR stays non-zero.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class LongestSubsequenceWithNonZeroBitwiseXor {
    public int longestSubsequence(int[] nums) {
        int xorSum = 0;
        int zeros = 0;
        for (int i : nums) {
            xorSum ^= i;
            if (i == 0) {
                zeros++;
            }
        }

        if (zeros == nums.length) {
            return 0;
        }

        if (xorSum == 0) {
            return nums.length - 1;
        }
        return nums.length;
    }
}
