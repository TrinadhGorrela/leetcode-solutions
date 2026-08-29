/**
 * 1. Two Sum
 * Difficulty: Easy | Tags: Array, Hash Table
 * https://leetcode.com/problems/two-sum/
 *
 * Pattern: One-Pass Hash Map
 * Key insight: Store previously seen numbers and their indices in a hash map to quickly check if the complement of the current number has been encountered.
 *
 * Time Complexity: O(N) - Single pass, constant time map operations
 * Space Complexity: O(N) - Stores up to N elements in hash map
 *
 * Edge Cases Handled: negative values, target requiring two negatives, duplicate values (complement may reuse index avoided via ordering), answer spanning endpoints
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
