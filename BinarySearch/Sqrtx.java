/**
 * 69. Sqrt(x)
 * Difficulty: Easy | Tags: Math, Binary Search, Newton's Method
 * https://leetcode.com/problems/sqrtx/
 *
 * Pattern: Binary Search on Integer Square Root
 * Key insight: Binary search the largest m with m*m <= x, comparing mid <= x/mid to avoid integer overflow, and remember the last viable mid.
 *
 * Time Complexity: O(log N) - Search space is halved per iteration in a monotonic sequence
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class Sqrtx {
    public int mySqrt(int x) {
        if (x == 0)
            return 0;

        int start = 1;
        int end = x;
        int res = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid <= x / mid) {
                res = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return res;
    }
}
