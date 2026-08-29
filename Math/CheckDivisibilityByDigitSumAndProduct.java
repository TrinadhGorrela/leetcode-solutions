/**
 * 3622. Check Divisibility by Digit Sum and Product
 * Difficulty: Easy | Tags: Math
 * https://leetcode.com/problems/check-divisibility-by-digit-sum-and-product/
 *
 * Pattern: Digit Extraction
 * Key insight: Extract individual digits via modulo arithmetic to compute the running sum and product simultaneously.
 *
 * Time Complexity: O(log n) - Number of digits in n is proportional to log10(n)
 * Space Complexity: O(1) - Only a few scalar variables are used
 *
 * Edge Cases Handled: any digit equal to 0 (product collapses to zero), single-digit n, divisor sum + product always positive so modulo is never a division by zero
 */
class CheckDivisibilityByDigitSumAndProduct {
    public boolean checkDivisibility(int n) {
        int temp = n;
        int sum = 0;
        int mul = 1;

        while (n != 0) {
            int rev = n % 10;
            sum += rev;
            mul *= rev;
            n /= 10;
        }

        return temp % (sum + mul) == 0;
    }
}
