/**
 * 1837. Sum of Digits in Base K
 * Difficulty: Easy | Tags: Math
 * https://leetcode.com/problems/sum-of-digits-in-base-k/
 *
 * Pattern: Base Conversion (Digit Sum)
 * Key insight: Repeatedly take n % k as the least significant base-k digit and divide n by k, summing the residues.
 *
 * Time Complexity: O(log_k n) - Number of base-k digits of n
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
* Edge Cases Handled: single-digit n, base k larger than n (result is n itself), loop terminates when n reaches 0
 */
class SumOfDigitsInBaseK {
    public int sumBase(int n, int k) {
        int sum = 0;
        while (n > 0) {
            int last = n % k;
            sum = sum + last;
            n = n / k;
        }
        return sum;
    }
}
