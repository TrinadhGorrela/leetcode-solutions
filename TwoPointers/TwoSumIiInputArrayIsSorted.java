/**
 * 167. Two Sum II - Input Array Is Sorted
 * Difficulty: Medium | Tags: Array, Two Pointers, Binary Search
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 *
 * Pattern: Two Pointers (Sorted Opposite Ends)
 * Key insight: Exploit the sorted array by pointing at both ends; move the left up when the sum is too small and the right down when too large, returning the 1-indexed pair.
 *
 * Time Complexity: O(N) - Two pointers approach iterating through elements once
 * Space Complexity: O(1) - Only allocates fixed-size arrays independent of input scaling
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class TwoSumIiInputArrayIsSorted {
    public static int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                res[0] = left + 1;
                res[1] = right + 1;
                return res;
            } else if (sum < target)
                left++;
            else
                right--;
        }
        return res;
    }
}
