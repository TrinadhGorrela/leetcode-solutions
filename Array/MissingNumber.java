/**
 * 268. Missing Number
 * Difficulty: Easy | Tags: Array, Hash Table, Math, Binary Search, Bit Manipulation, Sorting
 * https://leetcode.com/problems/missing-number/
 *
 * Pattern: Sorting
 * Key insight: Sort the numbers and find the first index whose value does not match the index; that index is the missing number (falling back to N if none).
 *
 * Time Complexity: O(N log N) - Dominated by the sorting operation on the input array
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: missing number N (largest), missing 0, single element, unsorted input
 */
class MissingNumber {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i)
                return i;
        }
        return nums.length;
    }
}
