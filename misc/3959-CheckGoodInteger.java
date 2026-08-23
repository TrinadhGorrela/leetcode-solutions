/**
 * 3959. Check Good Integer
 * Difficulty: Easy | Tags: Math, Simulation
 * https://leetcode.com/problems/check-good-integer/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
 */
class CheckGoodInteger {
    public boolean checkGoodInteger(int n) {
        int digitSum = 0;
        int squareSum = 0;
        while (n != 0) {
            int last = n % 10;
            digitSum = digitSum + last;
            squareSum = squareSum + (last * last);
            n /= 10;
        }

        return squareSum - digitSum >= 50;
    }
}
