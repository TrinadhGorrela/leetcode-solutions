/**
 * 1925. Count Square Sum Triples
 * Difficulty: Easy | Tags: Math, Enumeration
 * https://leetcode.com/problems/count-square-sum-triples/
 *
 * Pattern: Brute-force Enumeration (Pythagorean Triples)
 * Key insight: Test every (a, b) pair, check whether a^2 + b^2 is a perfect square within range, and count each valid triple.
 *
 * Time Complexity: O(N^2) - Uses nested loops to process elements in quadratic time
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class CountSquareSumTriples {
    public int countTriples(int n) {
        int res = 0;
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                int temp = (int) Math.sqrt((i * i) + (j * j));
                if ((temp * temp) == i * i + j * j && temp < n + 1)
                    res++;
            }
        }
        return res;
    }
}
