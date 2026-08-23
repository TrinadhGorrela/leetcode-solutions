/**
 * 2996. Smallest Missing Integer Greater Than Sequential Prefix Sum
 * Difficulty: Easy | Tags: Array, Hash Table, Sorting
 * https://leetcode.com/problems/smallest-missing-integer-greater-than-sequential-prefix-sum/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
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
