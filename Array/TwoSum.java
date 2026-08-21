/**
 * 1. Two Sum
 * Difficulty: Easy | Tags: Array, Hash Table
 * https://leetcode.com/problems/two-sum/
 *
 * Pattern: Array
 * Key insight: Systematically processes the input relying on array principles.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if (map.containsKey(comp)) {
                res[0] = map.get(comp);
                res[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return res;
    }
}
