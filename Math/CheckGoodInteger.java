/**
 * 3959. Check Good Integer
 * Difficulty: Easy | Tags: Math, Simulation
 * https://leetcode.com/problems/check-good-integer/
 *
 * Pattern: Digit Summary (Sum of Digits and Squares)
 * Key insight: Extract each digit with mod 10, accumulating both the digit sum and the sum of digits squared, then test whether their difference meets the threshold.
 *
 * Time Complexity: O(log N) - Iterates over the digits of the input number
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
* Edge Cases Handled: single-digit n, n = 0 (digit loop skipped), digit 0 contributes nothing to either sum
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
