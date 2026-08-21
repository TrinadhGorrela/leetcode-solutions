/**
 * 345. Reverse Vowels of a String
 * Difficulty: Easy | Tags: Two Pointers, String
 * https://leetcode.com/problems/reverse-vowels-of-a-string/
 *
 * Pattern: Two Pointers
 * Key insight: Systematically processes the input relying on two pointers principles.
 *
 * Time Complexity: O(N) - Two pointers approach iterating through elements once
 * Space Complexity: O(N) - Allocates memory for string processing
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class ReverseVowelsOfAString {
    public String reverseVowels(String s) {

		char[] chars = s.toCharArray();
		int left = 0;
		int right = chars.length - 1;

		while (left < right) {
			if (!check(chars[left])) {
				left++;
			}
			if (!check(chars[right])) {
				right--;;
			}
			if(check(chars[left]) && check(chars[right])) {
				char temp=chars[left];
				chars[left]=chars[right];
				chars[right]=temp;
				left++;
				right--;
			}
		}

		return new String(chars);
	}

	public static boolean check(char c) {
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {
			return true;
		}
		return false;

	}
    
}
