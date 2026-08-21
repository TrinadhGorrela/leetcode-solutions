/**
 * 1482. Minimum Number of Days to Make m Bouquets
 * Difficulty: Medium | Tags: Array, Binary Search
 * https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/
 *
 * Pattern: Array
 * Key insight: Systematically processes the input relying on array principles.
 *
 * Time Complexity: O(N log W) - Binary search over answer range with linear validation per step
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class MinimumNumberOfDaysToMakeMBouquets {
    public int minDays(int[] bloomDay, int m, int k) {
        int left = bloomDay[0];
        int right = bloomDay[0];
        int res = -1;

        if ((long) m * k > bloomDay.length) {
            return -1;
        }

        for (int i : bloomDay) {
            if (left > i) {
                left = i;
            }

            if (right < i) {
                right = i;
            }
        }

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (days(bloomDay, mid, k) >= m) {
                res = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return res;
    }

    public static int days(int[] nums, int r, int k) {
        int count = 0;
        int res = 0;
        for (int i : nums) {
            if (i <= r) {
                count++;
            } else {
                res += count / k;
                count = 0;
            }
        }
        res += count / k;
        return res;
    }
}
