/**
 * 3718. Smallest Missing Multiple of K
 * Difficulty: Easy | Tags: Array, Hash Table
 * https://leetcode.com/problems/smallest-missing-multiple-of-k/
 *
 * Pattern: Hash Set
 * Key insight: Store array in set and iterate multiples of k
 *
 * Time Complexity: O(N + (max/k)) - N for set creation, loop runs max/k times
 * Space Complexity: O(N) - Hash set storage for array elements
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
