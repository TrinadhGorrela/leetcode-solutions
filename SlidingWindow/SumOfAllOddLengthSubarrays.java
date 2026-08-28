/**
 * 1588. Sum of All Odd Length Subarrays
 * Difficulty: Easy | Tags: Array, Math, Prefix Sum
 * https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
 *
 * Pattern: Sliding Window (Running Sum)
 * Key insight: For each odd length, slide a fixed-size window over the array updating the sum incrementally, and add every window sum to the total.
 *
 * Time Complexity: O(N^2) - Uses nested loops to process elements in quadratic time
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class SumOfAllOddLengthSubarrays {
    public int sumOddLengthSubarrays(int[] nums) {
        int sum = 0;
        for (int i = 1; i <= nums.length; i += 2) {
            int curr = 0;
            for (int j = 0; j < i; j++) {
                curr += nums[j];
            }
            sum += curr;
            for (int k = i; k < nums.length; k++) {
                curr = curr - nums[k - i] + nums[k];
                sum += curr;
            }
        }
        return sum;
    }
}
