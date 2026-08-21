/**
 * 509. Fibonacci Number
 * Difficulty: Easy | Tags: Math, Dynamic Programming, Recursion, Memoization
 * https://leetcode.com/problems/fibonacci-number/
 *
 * Pattern: Math
 * Key insight: Systematically processes the input relying on math principles.
 *
 * Time Complexity: O(2^N) - Naive recursion explores overlapping subproblems exponentially
 * Space Complexity: O(N) - Requires space for the recursion call stack
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class FibonacciNumber {
    public int fib(int n) {
        if(n==0||n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}
