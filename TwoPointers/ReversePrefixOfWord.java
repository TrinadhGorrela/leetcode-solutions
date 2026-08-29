/**
 * 2000. Reverse Prefix of Word
 * Difficulty: Easy | Tags: Two Pointers, String, Stack
 * https://leetcode.com/problems/reverse-prefix-of-word/
 *
 * Pattern: Two Pointers (Locate Character, Swap Prefix)
 * Key insight: Find the first index of the target char, then reverse the substring from index 0 to that index by swapping with two inward pointers.
 *
 * Time Complexity: O(N) - Two pointers approach iterating through elements once
 * Space Complexity: O(N) - Allocates memory for string processing
 *
 * Edge Cases Handled: Character not present (returns original string), char at first position (no reversal), char at last position, single character
 */
class ReversePrefixOfWord {
    public String reversePrefix(String word, char ch) {
        int left = 0;
        int right = 0;
        char[] arr = word.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ch) {
                right = i;
                break;
            }
        }

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }
}
