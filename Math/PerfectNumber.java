/**
 * 507. Perfect Number
 * Difficulty: Easy | Tags: Math
 * https://leetcode.com/problems/perfect-number/
 *
 * Pattern: Math
 * Key insight: Systematically processes the input relying on math principles.
 *
 * Time Complexity: O(sqrt(N)) - Iterates up to the square root of N
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
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