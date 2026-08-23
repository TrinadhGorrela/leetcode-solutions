/**
 * 3702. Longest Subsequence With Non-Zero Bitwise XOR
 * Difficulty: Medium | Tags: Array, Bit Manipulation
 * https://leetcode.com/problems/longest-subsequence-with-non-zero-bitwise-xor/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
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
