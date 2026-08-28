/**
 * 3. Longest Substring Without Repeating Characters
 * Difficulty: Medium | Tags: Hash Table, String, Sliding Window
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 *
 * Pattern: Sliding Window + Hash Set
 * Key insight: Move the right pointer adding characters to a set; on a repeat, advance the left pointer removing characters until the duplicate is gone, then record the longest window.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int max = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
