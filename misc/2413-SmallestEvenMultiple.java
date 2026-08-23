/**
 * 2413. Smallest Even Multiple
 * Difficulty: Easy | Tags: Math, Number Theory
 * https://leetcode.com/problems/smallest-even-multiple/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
 */
class SmallestEvenMultiple {
    public int smallestEvenMultiple(int n) {
        if (n % 2 != 0) {
            return n*2;
        }
        return n;
    }
}
