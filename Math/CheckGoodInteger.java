/**
 * 3959. Check Good Integer
 * Difficulty: Easy | Tags: Math, Simulation
 * https://leetcode.com/problems/check-good-integer/
 *
 * Pattern: Math
 * Key insight: Systematically processes the input relying on math principles.
 *
 * Time Complexity: O(log N) - Iterates over the digits of the input number
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class CheckGoodInteger {
    public boolean checkGoodInteger(int n) {
        int digitSum = 0;
        int squareSum = 0;
        while (n != 0) {
            int last = n % 10;
            digitSum = digitSum + last;
            squareSum = squareSum + (last * last);
            n /= 10;
        }

        return squareSum - digitSum >= 50;
    }
}
