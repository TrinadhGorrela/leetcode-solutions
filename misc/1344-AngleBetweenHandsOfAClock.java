/**
 * 1344. Angle Between Hands of a Clock
 * Difficulty: Medium | Tags: Math
 * https://leetcode.com/problems/angle-between-hands-of-a-clock/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
 */
class AngleBetweenHandsOfAClock {
    public double angleClock(int hour, int minutes) {
        hour = hour * 30;
        double minute = (double) minutes * 11 / 2;
        double res = Math.abs(hour - minute);
        return res < 360 - res ? res : 360 - res;
    }
}
