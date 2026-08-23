/**
 * 2206. Divide Array Into Equal Pairs
 * Difficulty: Easy | Tags: Array, Hash Table, Bit Manipulation, Counting
 * https://leetcode.com/problems/divide-array-into-equal-pairs/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
 */
class DivideArrayIntoEqualPairs {
    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> res = new HashMap<>();
        if (nums.length % 2 != 0) {
            return false;
        }
        for (int i : nums) {
            res.put(i, res.getOrDefault(i, 0) + 1);
        }
        for (int count : res.values()) {
            if (count % 2 != 0) {
                return false;
            }
        }

        return true;
    }
}
