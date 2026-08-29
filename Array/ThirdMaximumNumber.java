/**
 * 414. Third Maximum Number
 * Difficulty: Easy | Tags: Array, Sorting
 * https://leetcode.com/problems/third-maximum-number/
 *
 * Pattern: Single-Pass (Track Top Three)
 * Key insight: Maintain the top three distinct values, rotating them down as larger values appear; skip duplicates, and return the third if it exists else the maximum.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: fewer than 3 distinct (returns max), duplicates skipped, all values equal, minimum Integer value as a candidate
 */
class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        Integer first = null;
        Integer second = null;
        Integer third = null;

        for (int i = 0; i < nums.length; i++) {
            if ((first != null && first == nums[i]) || (second != null && second == nums[i])
                    || (third != null && third == nums[i])) {
                continue;
            }
            if (first == null || nums[i] > first) {
                third = second;
                second = first;
                first = nums[i];
            } else if (second == null || nums[i] > second) {
                third = second;
                second = nums[i];
            } else if (third == null || nums[i] > third) {
                third = nums[i];
            }
        }
        return third == null ? first : third;
    }
}
