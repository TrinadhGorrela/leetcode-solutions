/**
 * 3471. Find the Largest Almost Missing Integer
 * Difficulty: Easy | Tags: Array, Hash Table
 * https://leetcode.com/problems/find-the-largest-almost-missing-integer/
 *
 * Pattern: Brute Force (Enumerate Subarrays)
 * Key insight: Enumerate every length-k contiguous subarray; a value is a candidate if it appears in exactly one subarray, and the answer is the largest such value.
 *
 * Time Complexity: O(N^2 * K) - Nested loops scanning through lists of
 * sub-arrays (Brute-force approach)
 * Space Complexity: O(N*K) - Uses nested lists containing sub-arrays
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class FindTheLargestAlmostMissingInteger {
    public int largestInteger(int[] nums, int k) {
        List<List<Integer>> list = new ArrayList<>();
        int res = -1;
        for (int i = 0; i <= nums.length - k; i++) {
            add(nums, list, i, k);
        }

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (List<Integer> list2 : list) {
                if (list2.contains(nums[i])) {
                    count++;
                }
            }
            if (count == 1 && res < nums[i]) {
                res = nums[i];
            }
        }
        return res;
    }

    public static void add(int[] nums, List<List<Integer>> list, int st, int k) {
        List<Integer> temp = new ArrayList<>();
        for (int i = st; i < st + k; i++) {
            temp.add(nums[i]);
        }
        list.add(temp);
    }
}
