/**
 * 367. Valid Perfect Square
 * Difficulty: Easy | Tags: Math, Binary Search
 * https://leetcode.com/problems/valid-perfect-square/
 *
 * Pattern: Binary Search on Integer Square Root
 * Key insight: Binary search for an integer whose square exactly equals num, using long arithmetic when squaring to avoid overflow.
 *
 * Time Complexity: O(log N) - Search space is halved per iteration in a monotonic sequence
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: num < 0 (returns false), num = 0, num = 1 (perfect square), overflow avoided via long multiplication
 */
class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {

        if (num < 0)
            return false;

        int t = 1;
        int s = num;
        
        while (t <= s) {
            int b = t + (s - t) / 2;
            long sq = (long) b * b;
            if (sq == num)
                return true;
            else if (sq < num)
                t = b + 1;
            else
                s = b - 1;
        }
        return false;

    }
}
