/**
 * 2206. Divide Array Into Equal Pairs
 * Difficulty: Easy | Tags: Array, Hash Table, Bit Manipulation, Counting
 * https://leetcode.com/problems/divide-array-into-equal-pairs/
 *
 * Pattern: Hash Map (Counting)
 * Key insight: The array can be paired iff every value occurs an even number of times; count frequencies and verify all counts are even.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
 * Edge Cases Handled: odd length (returns false), all elements distinct (odd counts), all equal pairs, single occurrence of a value
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
