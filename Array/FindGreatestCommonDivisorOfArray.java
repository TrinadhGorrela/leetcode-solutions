/**
 * 1979. Find Greatest Common Divisor of Array
 * Difficulty: Easy | Tags: Array, Math, Number Theory, Euclidean Algorithm, Greatest Common Divisor
 * https://leetcode.com/problems/find-greatest-common-divisor-of-array/
 *
 * Pattern: Math (Euclidean Algorithm)
 * Key insight: The GCD of the whole array equals the GCD of its smallest and largest elements; use the Euclidean algorithm to compute a GCD in O(log min) time.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class FindGreatestCommonDivisorOfArray {
    public int findGCD(int[] nums) {
        int small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (small > nums[i]) {
                small = nums[i];
            }
            if (large < nums[i]) {
                large = nums[i];
            }
        }
        return gcd(large, small);
    }

    public static int gcd(int s, int t) {
        while (t != 0) {
            int temp = t;
            t = s % t;
            s = temp;
        }
        return s;
    }
}
