/**
 * 2221. Find Triangular Sum of an Array
 * Difficulty: Medium | Tags: Array, Math, Simulation, Combinatorics, Number Theory
 * https://leetcode.com/problems/find-triangular-sum-of-an-array/
 *
 * Pattern: Simulation
 * Key insight: Repeatedly replace the array with the pairwise modulo-10 sums of adjacent elements until a single value remains.
 *
 * Time Complexity: O(N^2) - Uses nested loops to process elements in quadratic time
 * Space Complexity: O(N) - sum() allocates a new array each pass
 *
 * Edge Cases Handled: single element (returns it directly), sums causing carry (modulo 10), adjacent pair sums
 */
class FindTriangularSumOfAnArray {
       public static int triangularSum(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            int[] tri = sum(nums);
            for (int t = 0; t < tri.length; t++) {
                nums[t] = tri[t];
            }
        }
        return nums[0];
    }

    public static int[] sum(int[] nums) {
        int[] sum = new int[nums.length - 1];
        for (int i = 0; i < nums.length - 1; i++) {
            sum[i] = (nums[i] + nums[i + 1]) % 10;
        }
        return sum;
    }
}
