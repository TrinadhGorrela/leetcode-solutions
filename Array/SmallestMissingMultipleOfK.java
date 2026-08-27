/**
 * 3718. Smallest Missing Multiple of K
 * Difficulty: Easy | Tags: Array, Hash Table
 * https://leetcode.com/problems/smallest-missing-multiple-of-k/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
 */
class SmallestMissingMultipleOfK {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        for (int i : nums) {
            set.add(i);
        }

        int res = k;

        while (set.contains(res)) {
            res += k;
        }
        return res;
    }
}
