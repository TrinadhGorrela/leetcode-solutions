/**
 * 704. Binary Search
 * Difficulty: Easy | Tags: Array, Binary Search
 * https://leetcode.com/problems/binary-search/
 *
 * Pattern: Classical Binary Search
 * Key insight: Repeatedly probe the middle of the remaining interval and discard the half that cannot contain the target, shrinking the search space by half each iteration.
 *
 * Time Complexity: O(log N) - Search space is halved per iteration in a monotonic sequence
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: target not found (returns -1), single element, target at first/last index (boundaries)
 */
class BinarySearch {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int res;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target)
                return mid;

            else if (nums[mid] < target)
                start = mid + 1;

            else
                end = mid - 1;
        }

        return -1;
    }
}
