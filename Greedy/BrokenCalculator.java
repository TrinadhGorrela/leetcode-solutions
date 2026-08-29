/**
 * 991. Broken Calculator
 * Difficulty: Medium | Tags: Math, Greedy
 * https://leetcode.com/problems/broken-calculator/
 *
 * Pattern: Greedy (Reverse from Target)
 * Key insight: Work backwards from target: halve it when even else increment, because the forward operations only make the value grow; convert the remainder with startValue - target at the end.
 *
 * Time Complexity: O(log(target)) - Divides by 2 or adds 1, reaching startValue in log time
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
* Edge Cases Handled: target already equal to startValue (zero operations), odd target (incremented instead of halved), target below startValue (only double+decrement path, converted via subtraction)
 */
class BrokenCalculator {
    public int brokenCalc(int startValue, int target) {
        int count = 0;
        while (target > startValue) {
            if (target % 2 == 0) {
                target /= 2;
            } else {
                target++;
            }
            count++;
        }

        count += startValue - target;
        return count;
    }
}
