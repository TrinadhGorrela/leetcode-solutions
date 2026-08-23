/**
 * 1837. Sum of Digits in Base K
 * Difficulty: Easy | Tags: Math
 * https://leetcode.com/problems/sum-of-digits-in-base-k/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
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
