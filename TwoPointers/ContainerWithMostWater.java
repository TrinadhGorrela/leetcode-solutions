/**
 * 11. Container With Most Water
 * Difficulty: Medium | Tags: Array, Two Pointers, Greedy
 * https://leetcode.com/problems/container-with-most-water/
 *
 * Pattern: Two Pointers (Shrink from Ends)
 * Key insight: Start pointers at both ends, compute area from the shorter wall's height and current width, then move the shorter wall inward since its height bounds the container.
 *
 * Time Complexity: O(N) - Two pointers approach iterating through elements once
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Two-element minimal array, equal wall heights (right pointer moves), single element (area 0), tallest walls adjacent/at ends
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
