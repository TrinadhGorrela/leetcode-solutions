/**
 * 557. Reverse Words in a String III
 * Difficulty: Easy | Tags: Two Pointers, String
 * https://leetcode.com/problems/reverse-words-in-a-string-iii/
 *
 * Pattern: Two Pointers (Per-Word Reversal)
 * Key insight: Mark each word's start, and on each space reverse the just-completed word by swapping its boundaries; reverse the final word after the loop.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(N) - Allocates memory for string processing
 *
 * Edge Cases Handled: Empty string, single word (no spaces), multiple words, single-character words
 */
class ReverseWordsInAStringIii {
    public String reverseWords(String s) {
      char[] arr = s.toCharArray();
		int j = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				swap(arr, j, i - 1);
				j = i + 1;
			}
		}
		swap(arr, j, s.length()-1);

		return new String(arr);

	}

	public static void swap(char[] arr, int st, int en) {
		while (st < en) {
			char temp = arr[st];
			arr[st] = arr[en];
			arr[en] = temp;
			st++;
			en--;
		}
	}   
}
