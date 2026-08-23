/**
 * 2000. Reverse Prefix of Word
 * Difficulty: Easy | Tags: Two Pointers, String, Stack
 * https://leetcode.com/problems/reverse-prefix-of-word/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
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
