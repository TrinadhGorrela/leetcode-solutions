/**
 * 219. Contains Duplicate II
 * Difficulty: Easy | Tags: Array, Hash Table, Sliding Window
 * https://leetcode.com/problems/contains-duplicate-ii/
 *
 * Pattern: Brute Force (Nested Loops)
 * Key insight: For each element, scan the next k positions and return true if an equal value appears within the window.
 *
 * Time Complexity: O(N*K) - Inner loop constrained by window size k
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class ContainsDuplicateIi {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length && j - i <= k; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
