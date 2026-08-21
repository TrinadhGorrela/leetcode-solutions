/**
 * 204. Count Primes
 * Difficulty: Medium | Tags: Array, Math, Enumeration, Number Theory, Primality Test, Sieve Theory, Prime Number Sieve
 * https://leetcode.com/problems/count-primes/
 *
 * Pattern: Array
 * Key insight: Systematically processes the input relying on array principles.
 *
 * Time Complexity: O(N log log N) - Sieve of Eratosthenes approach
 * Space Complexity: O(N) - Allocates an array that scales dynamically with input size
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class CountPrimes {
    public int countPrimes(int n) {
        if (n <= 1) {
            return 0;
        }
        boolean[] nums = new boolean[n];

        for (int i = 2; i < nums.length; i++) {
            if (!nums[i]) {
                for (int j = i * 2; j < nums.length; j += i) {
                    nums[j] = true;
                }
            }
        }
        int res = 0;
        for (int i = 2; i < nums.length; i++) {
            if (!nums[i]) {
                res++;
            }
        }
        return res;
    }
}
