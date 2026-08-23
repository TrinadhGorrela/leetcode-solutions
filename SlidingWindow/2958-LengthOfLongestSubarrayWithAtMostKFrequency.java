/**
 * 2958. Length of Longest Subarray With at Most K Frequency
 * Difficulty: Medium | Tags: Array, Hash Table, Sliding Window
 * https://leetcode.com/problems/length-of-longest-subarray-with-at-most-k-frequency/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
 */
class LengthOfLongestSubarrayWithAtMostKFrequency {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        int left = 0;
        int max = 0;
        for (int right = 0; right < nums.length; right++) {
            freq.put(nums[right], freq.getOrDefault(nums[right], 0) + 1);
            while (freq.get(nums[right]) > k) {
                freq.put(nums[left], freq.get(nums[left]) - 1);
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
