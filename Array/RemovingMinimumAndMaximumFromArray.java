/**
 * 2091. Removing Minimum and Maximum From Array
 * Difficulty: Medium | Tags: Array, Greedy
 * https://leetcode.com/problems/removing-minimum-and-maximum-from-array/
 *
 * Pattern: Array Scan + Minimum Deletions (Front/Back Removal)
 * Key insight: Locate the indices of the global min and max; the minimum deletions is the smallest of three strategies — delete from the front up to the farther index, from the back up to the nearer index, or split (min from one side, max from the other).
 *
 * Time Complexity: O(N) - Single pass detects the min and max indices
 * Space Complexity: O(1) - Only a constant number of integer indices are tracked
 *
 * Edge Cases Handled: min and max at the same index (e.g. all elements equal), min/max already at an end (index 0 or N-1), N = 2 boundary
 */
class RemovingMinimumAndMaximumFromArray {
    public int minimumDeletions(int[] nums) {
        int min = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[min] > nums[i]) {
                min = i;
            }

            if (nums[max] < nums[i]) {
                max = i;
            }
        }

        int front = Math.max(min, max) + 1;
        int back = nums.length - Math.min(min, max);
        int both = (Math.min(min, max) + 1) + (nums.length - Math.max(min, max));

        return Math.min(front, Math.min(back, both));
    }
}
