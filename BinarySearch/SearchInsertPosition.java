/**
 * 35. Search Insert Position
 * Difficulty: Easy | Tags: Array, Binary Search
 * https://leetcode.com/problems/search-insert-position/
 *
 * Pattern: Binary Search (Lower Bound)
 * Key insight: Track the first index where the value is >= target; when the loop ends, low naturally holds the correct insertion position.
 *
 * Time Complexity: O(log N) - Search space is halved per iteration in a
 * monotonic sequence
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}
