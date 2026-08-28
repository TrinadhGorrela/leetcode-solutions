/**
 * 917. Reverse Only Letters
 * Difficulty: Easy | Tags: Two Pointers, String
 * https://leetcode.com/problems/reverse-only-letters/
 *
 * Pattern: Two Pointers (Letter Swap, Skip Non-Letters)
 * Key insight: Swap letters with two pointers moving inward, advancing each pointer past any non-letter before swapping; non-letters stay in place.
 *
 * Time Complexity: O(N) - Two pointers approach iterating through elements once
 * Space Complexity: O(N) - Allocates memory for string processing
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class ReverseOnlyLetters {
    public static String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (Character.isLetter(arr[left]) && Character.isLetter(arr[right])) {
                swap(arr, left, right);
                left++;
                right--;
            }
            if (!Character.isLetter(arr[left])) {
                left++;
            }
            if (!Character.isLetter(arr[right])) {
                right--;
            }
        }
        return new String(arr);
    }

    public static void swap(char[] arr, int left, int right) {
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

}
