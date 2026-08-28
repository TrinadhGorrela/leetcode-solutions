/**
 * 3090. Maximum Length Substring With Two Occurrences
 * Difficulty: Easy | Tags: Hash Table, String, Sliding Window
 * https://leetcode.com/problems/maximum-length-substring-with-two-occurrences/
 *
 * Pattern: Sliding Window (At Most Two of Each)
 * Key insight: Extend the right edge counting each char; when the newest char exceeds two occurrences, advance the left edge to restore the constraint, maximizing the valid window.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(1) - Map keys bounded by alphabet size
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class MaximumLengthSubstringWithTwoOccurrences {
    public int maximumLengthSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int max = 0;

        for (int right = 0; right < s.length(); right++) {
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);

            while (map.get(s.charAt(right)) > 2) {
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
