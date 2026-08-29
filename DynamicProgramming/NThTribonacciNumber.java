/**
 * 1137. N-th Tribonacci Number
 * Difficulty: Easy | Tags: Math, Dynamic Programming, Memoization
 * https://leetcode.com/problems/n-th-tribonacci-number/
 *
 * Pattern: Iterative Dynamic Programming (Rolling Variables)
 * Key insight: Build T(n) from the previous three values, sliding three rolling variables forward instead of allocating a full DP table.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
* Edge Cases Handled: n = 0, n = 1, n = 2 (base cases), n = 3 (first sum iteration)
 */
class NThTribonacciNumber {
    public int tribonacci(int n) {
        
        if (n == 0)
            return 0;

        if (n == 1 || n == 2)
            return 1;

        int t1 = 0, t2 = 1, t3 = 1;
        int res = 0;
        
        for (int i = 3; i <= n; i++) {
            res = t1 + t2 + t3;
            t1 = t2;
            t2 = t3;
            t3 = res;
        }
        return res;
    }
}
