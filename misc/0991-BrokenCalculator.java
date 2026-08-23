/**
 * 991. Broken Calculator
 * Difficulty: Medium | Tags: Math, Greedy
 * https://leetcode.com/problems/broken-calculator/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
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
