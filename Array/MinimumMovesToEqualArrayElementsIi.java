/**
 * 462. Minimum Moves to Equal Array Elements II
 * Difficulty: Medium | Tags: Array, Math, Sorting
 * https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/
 *
 * Pattern: Sorting + Median
 * Key insight: The value that minimizes the sum of absolute deviations is the median; after sorting, accumulate distances of all elements to the middle element.
 *
 * Time Complexity: O(N log N) - Dominated by the sorting operation on the input array
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: single element (0 moves), all elements equal, even-length median, negative values
 */
class MinimumMovesToEqualArrayElementsIi {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid = nums[nums.length / 2];
        int res = 0;

        for (int i = 0; i < nums.length; i++) {
            res += Math.abs(nums[i] - mid);
        }

        return res;
    }
}
