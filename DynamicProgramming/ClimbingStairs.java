/**
 * 70. Climbing Stairs
 * Difficulty: Easy | Tags: Math, Dynamic Programming, Memoization
 * https://leetcode.com/problems/climbing-stairs/
 *
 * Pattern: Dynamic Programming (Fibonacci)
 * Key insight: The number of ways to reach step i is the sum of ways to reach steps i-1 and i-2 (since you climb 1 or 2 steps), making this a simple Fibonacci recurrence.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(N) - Allocates an array that scales dynamically with input size
 *
 * Edge Cases Handled: n = 0 or n = 1 (returns 1), n = 2
 */
class ClimbingStairs {
    public int climbStairs(int n) {
        if (n <= 1)
            return 1;
        int[] res = new int[n + 1];
        res[1] = 1;
        res[2] = 2;
        for (int i = 3; i <= n; i++) {
            res[i] = res[i - 1] + res[i - 2];
        }
        return res[n];
    }
}
