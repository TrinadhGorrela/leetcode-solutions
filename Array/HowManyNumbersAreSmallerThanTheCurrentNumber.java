/**
 * 1365. How Many Numbers Are Smaller Than the Current Number
 * Difficulty: Easy | Tags: Array, Hash Table, Sorting, Counting Sort
 * https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
 *
 * Pattern: Array
 * Key insight: Systematically processes the input relying on array principles.
 *
 * Time Complexity: O(N^2) - Uses nested loops to process elements in quadratic time
 * Space Complexity: O(N) - Allocates the result array
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int s = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] > nums[j]) {
                    s++;
                }

            }
            res[i] = s;
        }

        return res;
    }
}
