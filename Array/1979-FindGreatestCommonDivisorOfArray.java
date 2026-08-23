/**
 * 1979. Find Greatest Common Divisor of Array
 * Difficulty: Easy | Tags: Array, Math, Number Theory, Euclidean Algorithm, Greatest Common Divisor
 * https://leetcode.com/problems/find-greatest-common-divisor-of-array/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
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
