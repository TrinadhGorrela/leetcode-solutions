/**
 * 164. Maximum Gap
 * Difficulty: Medium | Tags: Array, Sorting, Bucket Sort, Radix Sort, Pigeonhole Principle
 * https://leetcode.com/problems/maximum-gap/
 *
 * Pattern: Sorting
 * Key insight: Sort the array and take the maximum difference between consecutive elements. (Linear bucket/radix sort achieves O(N); sorting is the straightforward but suboptimal O(N log N) route.)
 *
 * Time Complexity: O(N log N) - Dominated by the sorting operation on the input array (Suboptimal approach)
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: fewer than 2 elements (returns 0), all equal elements (gap 0), unsorted input, negative values
 */
class MaximumGap {
    public int maximumGap(int[] nums) {

        if (nums.length < 2)
            return 0;

        Arrays.sort(nums);
        int maxGap = 0;

        for (int i = 1; i < nums.length; i++) {
            int currentGap = nums[i] - nums[i - 1];
            maxGap = Math.max(maxGap, currentGap);
        }

        return maxGap;
    }
}
