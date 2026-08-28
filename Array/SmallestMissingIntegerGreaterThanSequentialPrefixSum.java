/**
 * 2996. Smallest Missing Integer Greater Than Sequential Prefix Sum
 * Difficulty: Easy | Tags: Array, Hash Table, Sorting
 * https://leetcode.com/problems/smallest-missing-integer-greater-than-sequential-prefix-sum/
 *
 * Pattern: Hash Set + Sequential Prefix Sum
 * Key insight: Sum the longest prefix where consecutive values differ by 1, then keep incrementing that sum until it is not present in the set of all elements.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class SmallestMissingIntegerGreaterThanSequentialPrefixSum {
    public int missingInteger(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (int i : nums) {
            seen.add(i);
        }

        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == 1) {
                sum += nums[i];
            } else {
                break;
            }
        }

        while (seen.contains(sum)) {
            sum++;
        }

        return sum;
    }
}
