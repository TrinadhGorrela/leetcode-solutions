/**
 * 976. Largest Perimeter Triangle
 * Difficulty: Easy | Tags: Array, Math, Greedy, Sorting, Quicksort, Polygons
 * https://leetcode.com/problems/largest-perimeter-triangle/
 *
 * Pattern: Sorting + Greedy
 * Key insight: Sort descending and test triples from the largest side; the triangle inequality a+b>c holds for the first valid consecutive triple, giving the maximum perimeter.
 *
 * Time Complexity: O(N log N) - Dominated by the sorting operation on the input array
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class LargestPerimeterTriangle {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for (int i = nums.length - 1; i >= 2; i--) {
            if (nums[i - 2] + nums[i - 1] > nums[i]) {
                return nums[i - 2] + nums[i - 1] + nums[i];
            }
        }
        return 0;
    }
}
