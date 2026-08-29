/**
 * 507. Perfect Number
 * Difficulty: Easy | Tags: Math
 * https://leetcode.com/problems/perfect-number/
 *
 * Pattern: Divisor Summation (Square-Root Bound)
 * Key insight: A divisor d pairs with n/d, so only scan up to sqrt(n), adding both members of each pair while skipping the number itself; perfect iff the sum equals n.
 *
 * Time Complexity: O(sqrt(N)) - Iterates up to the square root of N
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: num = 1 (loop runs and compares to itself), perfect-square divisors (sqrt not double-counted), divisor pair equal to num itself skipped
 */
class PerfectNumber {
    public boolean checkPerfectNumber(int num) {

        int res = 0;
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                res = res + i;
                if (num / i != i && num / i != num) {
                    res = res + num / i;
                }
            }
        }

        return res == num ? true : false;
    }
}