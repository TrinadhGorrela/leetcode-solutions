/**
 * 1802. Maximum Value at a Given Index in a Bounded Array
 * Difficulty: Medium | Tags: Math, Binary Search, Greedy
 * https://leetcode.com/problems/maximum-value-at-a-given-index-in-a-bounded-array/
 *
 * Pattern: Binary Search on Answer + Math
 * Key insight: Binary search the peak value at the given index, and use an arithmetic-series formula to compute the minimal total array sum required for a candidate peak (decrementing on both sides down to 1).
 *
 * Time Complexity: O(log N) - Search space is halved per iteration in a monotonic sequence
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: index at the edge of array (one side count 0), decrements reaching 1 (long formula), large n/maxSum (long arithmetic to avoid overflow)
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
