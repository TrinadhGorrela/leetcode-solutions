/**
 * 1344. Angle Between Hands of a Clock
 * Difficulty: Medium | Tags: Math
 * https://leetcode.com/problems/angle-between-hands-of-a-clock/
 *
 * Pattern: Clock Geometry Formula
 * Key insight: Hour hand moves 30 degrees/hour, minute hand 6 degrees/min (relative 5.5 deg/min); take the smaller angle between the two positions, min(diff, 360-diff).
 *
 * Time Complexity: O(1) - Computes the result mathematically without any iteration
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
* Edge Cases Handled: hour = 12 (wraps to the 0-degree full circle), hands overlapping (12:00 gives angle 0), angle exactly 180 (straight line, tie broken to 180)
 */
class AngleBetweenHandsOfAClock {
    public double angleClock(int hour, int minutes) {
        hour = hour * 30;
        double minute = (double) minutes * 11 / 2;
        double res = Math.abs(hour - minute);
        return res < 360 - res ? res : 360 - res;
    }
}
