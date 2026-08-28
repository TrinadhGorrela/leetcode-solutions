/**
 * 344. Reverse String
 * Difficulty: Easy | Tags: Two Pointers, String
 * https://leetcode.com/problems/reverse-string/
 *
 * Pattern: Two Pointers (In-Place Swap)
 * Key insight: Swap the characters at two pointers moving from both ends toward the center, reversing the array in place.
 *
 * Time Complexity: O(N) - Two pointers approach iterating through elements once
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class ReverseString {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left <= right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
