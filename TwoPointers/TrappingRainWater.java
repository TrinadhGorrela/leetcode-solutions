/**
 * 42. Trapping Rain Water
 * Difficulty: Hard | Tags: Array, Two Pointers, Dynamic Programming, Stack, Monotonic Stack
 * https://leetcode.com/problems/trapping-rain-water/
 *
 * Pattern: Two Pointers
 * Key insight: Water trapped above a bar is bounded by min(leftMax, rightMax) - height; move the pointer on the shorter side, updating its max and adding the difference.
 *
 * Time Complexity: O(N) - Two-pointer approach is linear
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: fewer than 3 bars, flat (all equal) / monotonic arrays (no water), equal-height left/right sides
 */
class TrappingRainWater {
    public int trap(int[] height) {
        int water = 0;
        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;

        while (left < right) {
            if (height[left] <= height[right]) {
                leftMax = Math.max(leftMax, height[left]);
                if (height[left] < leftMax) {
                    water += leftMax - height[left];
                }
                left++;
            } else {
                rightMax = Math.max(rightMax, height[right]);
                if (height[right] < rightMax) {
                    water += rightMax - height[right];
                }
                right--;
            }
        }
        return water;
    }
}
