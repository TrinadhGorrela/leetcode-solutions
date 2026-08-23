/**
 * 1748. Sum of Unique Elements
 * Difficulty: Easy | Tags: Array, Hash Table, Counting
 * https://leetcode.com/problems/sum-of-unique-elements/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
 */
class SumOfUniqueElements {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == 1) {
                res = res + nums[i];
            }
        }
        return res;
    }
}
