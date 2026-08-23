/**
 * 1802. Maximum Value at a Given Index in a Bounded Array
 * Difficulty: Medium | Tags: Math, Binary Search, Greedy
 * https://leetcode.com/problems/maximum-value-at-a-given-index-in-a-bounded-array/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
 */
class MaximumValueAtAGivenIndexInABoundedArray {
    public int maxValue(int n, int index, int maxSum) {
        int left = 1;
        int right = maxSum;
        int res = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long leftCount = index;
            long rightCount = n - 1 - index;

            long total = mid + calc(mid, leftCount) + calc(mid, rightCount);

            if (total <= maxSum) {
                res = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return res;
    }

    public static long calc(int v, long count) {
        if (count == 0) {
            return 0;
        }

        long k = Math.min(count, v - 1);
        if (k > 0) {
            long first = v - 1;
            long last = v - 1 * k;
            long decSum = k * (first + last) / 2;
            long ones = count - k;
            return decSum + ones;
        }
        return count;
    }
}
