/**
 * 1502. Can Make Arithmetic Progression From Sequence
 * Difficulty: Easy | Tags: Array, Sorting
 * https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
 */
class CanMakeArithmeticProgressionFromSequence {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int d = arr[1] - arr[0];
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != d)
                return false;
        }
        return true;
    }
}
