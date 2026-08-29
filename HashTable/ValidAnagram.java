/**
 * 242. Valid Anagram
 * Difficulty: Easy | Tags: Hash Table, String, Sorting
 * https://leetcode.com/problems/valid-anagram/
 *
 * Pattern: Character Frequency Array (Counting)
 * Key insight: Increment a 26-slot counter for each char of s and decrement for t; the strings are anagrams iff all slots return to zero (after lengths match).
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(1) - Only allocates fixed-size arrays independent of input scaling
 *
 * Edge Cases Handled: different lengths (returns false), empty strings (true), all same characters, single character anagrams
 */
class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int m = s.length();
        int n = t.length();
        if (m != n)
            return false;

        int[] count = new int[26];

        for (int i = 0; i < m; i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int res : count) {
            if (res != 0)
                return false;
        }

        return true;

    }
}
