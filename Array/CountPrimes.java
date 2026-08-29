/**
 * 204. Count Primes
 * Difficulty: Medium | Tags: Array, Math, Enumeration, Number Theory, Primality Test, Sieve Theory, Prime Number Sieve
 * https://leetcode.com/problems/count-primes/
 *
 * Pattern: Sieve of Eratosthenes
 * Key insight: Mark multiples of each prime starting from 2 as composite in a boolean array; the unmarked cells are primes. Count them for numbers < n.
 *
 * Time Complexity: O(N log log N) - Sieve of Eratosthenes approach
 * Space Complexity: O(N) - Allocates an array that scales dynamically with input size
 *
 * Edge Cases Handled: n <= 1 (returns 0), n = 2, n = 3 (prime itself excluded)
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
