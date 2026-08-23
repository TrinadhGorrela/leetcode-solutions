/**
 * 1588. Sum of All Odd Length Subarrays
 * Difficulty: Easy | Tags: Array, Math, Prefix Sum
 * https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
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
