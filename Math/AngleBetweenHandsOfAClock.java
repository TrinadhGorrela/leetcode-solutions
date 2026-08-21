/**
 * 1344. Angle Between Hands of a Clock
 * Difficulty: Medium | Tags: Math
 * https://leetcode.com/problems/angle-between-hands-of-a-clock/
 *
 * Pattern: Math
 * Key insight: Systematically processes the input relying on math principles.
 *
 * Time Complexity: O(1) - Computes the result mathematically without any iteration
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class AngleBetweenHandsOfAClock {
    public double angleClock(int hour, int minutes) {
        hour = hour * 30;
        double minute = (double) minutes * 11 / 2;
        double res = Math.abs(hour - minute);
        return res < 360 - res ? res : 360 - res;
    }
}
