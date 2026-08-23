/**
 * 1004. Max Consecutive Ones III
 * Difficulty: Medium | Tags: Array, Binary Search, Sliding Window, Prefix Sum
 * https://leetcode.com/problems/max-consecutive-ones-iii/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
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
