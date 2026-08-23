/**
 * 1925. Count Square Sum Triples
 * Difficulty: Easy | Tags: Math, Enumeration
 * https://leetcode.com/problems/count-square-sum-triples/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
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
