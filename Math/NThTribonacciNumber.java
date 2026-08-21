/**
 * 1137. N-th Tribonacci Number
 * Difficulty: Easy | Tags: Math, Dynamic Programming, Memoization
 * https://leetcode.com/problems/n-th-tribonacci-number/
 *
 * Pattern: Math
 * Key insight: Systematically processes the input relying on math principles.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
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
