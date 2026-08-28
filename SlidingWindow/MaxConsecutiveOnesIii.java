/**
 * 1004. Max Consecutive Ones III
 * Difficulty: Medium | Tags: Array, Binary Search, Sliding Window, Prefix Sum
 * https://leetcode.com/problems/max-consecutive-ones-iii/
 *
 * Pattern: Sliding Window (At Most k Zeros)
 * Key insight: Track the number of zeros in the window; when it exceeds k, shrink from the left until zeros are within budget, keeping the longest window that is flippable to all ones.
 *
 * Time Complexity: O(N) - Sliding window takes linear time
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class MaxConsecutiveOnesIii {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int max = 0;
        int count = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0 && count <= k) {
                count++;
            }
            while (count > k) {
                if (nums[left] == 0) {
                    count--;
                }
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
