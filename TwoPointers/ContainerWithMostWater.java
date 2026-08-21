/**
 * 11. Container With Most Water
 * Difficulty: Medium | Tags: Array, Two Pointers, Greedy
 * https://leetcode.com/problems/container-with-most-water/
 *
 * Pattern: Array
 * Key insight: Systematically processes the input relying on array principles.
 *
 * Time Complexity: O(N) - Two pointers approach iterating through elements once
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int Maxarea = 0, area = 0;
        while (left < right) {
            area = Math.min(height[left], height[right]) * (right - left);
            Maxarea = Math.max(Maxarea, area);
            if (height[left] < height[right])
                left++;
            else
                right--;
        }
        return Maxarea;
    }
}
