/**
 * 448. Find All Numbers Disappeared in an Array
 * Difficulty: Easy | Tags: Array, Hash Table
 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
 *
 * Pattern: In-place Marking (Negation Trick)
 * Key insight: Use the array itself as a marker: for each value, negate the element at the index it maps to; any index left positive corresponds to a missing number. No extra space needed.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(1) - Marks elements in-place by negation, no auxiliary collection
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                res.add(i + 1);
        }
        return res;
    }
}
