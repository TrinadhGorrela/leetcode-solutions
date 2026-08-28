/**
 * 1011. Capacity To Ship Packages Within D Days
 * Difficulty: Medium | Tags: Array, Binary Search
 * https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
 *
 * Pattern: Binary Search on Answer (Feasibility)
 * Key insight: Search the minimum possible capacity between the heaviest package and the total weight; check feasibility by greedily counting the days required for a candidate capacity.
 *
 * Time Complexity: O(N log W) - Binary search over answer range with linear validation per step
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class CapacityToShipPackagesWithinDDays {

    public static boolean isValid(int[] weights, int days, int c) {
        int capacity = 0;
        int daysneed = 1;
        for (int i = 0; i < weights.length; i++) {
            capacity += weights[i];
            if (capacity > c) {
                capacity = weights[i];
                daysneed++;
            }
        }

        return daysneed <= days;
    }

    public int shipWithinDays(int[] weights, int days) {
        int minCapacity = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        for (int i = 0; i < weights.length; i++) {
            left = Math.max(left, weights[i]);
            right += weights[i];
        }

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (isValid(weights, days, mid)) {
                minCapacity = Math.min(minCapacity, mid);
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return minCapacity;
    }
}
