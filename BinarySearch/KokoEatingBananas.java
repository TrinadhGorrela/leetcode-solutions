/**
 * 875. Koko Eating Bananas
 * Difficulty: Medium | Tags: Array, Binary Search
 * https://leetcode.com/problems/koko-eating-bananas/
 *
 * Pattern: Binary Search on Answer (Feasibility)
 * Key insight: Search eating speeds from 1 to the largest pile; validate a candidate speed by computing the total hours needed (ceiling of pile/speed) and comparing against h.
 *
 * Time Complexity: O(N log W) - Binary search over answer range with linear validation per step
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;

        for (int i : piles) {
            if (right < i) {
                right = i;
            }
        }
        int res = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long temp = isValid(piles, mid);
            if (temp <= h) {
                res = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return res;
    }

    public static long isValid(int[] piles, int n) {
        long res = 0;
        for (int i = 0; i < piles.length; i++) {
            int temp = piles[i] / n;
            if (piles[i] % n == 0) {
                res += temp;
            } else {
                res += temp + 1;
            }
        }
        return res;
    }
}
