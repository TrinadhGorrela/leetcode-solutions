/**
 * 2904. Shortest and Lexicographically Smallest Beautiful String
 * Difficulty: Medium | Tags: String, Sliding Window
 * https://leetcode.com/problems/shortest-and-lexicographically-smallest-beautiful-string/
 *
 * Pattern: Sliding Window
 * Key insight: Expand right pointer, shrink left when condition met, track min length and lexicographical order
 *
 * Time Complexity: O(N) - Each character processed at most twice
 * Space Complexity: O(1) - Constant extra space (ignoring output string)
 *
 * Edge Cases Handled: No substring with k ones (returns empty string), k larger than count of ones, single 1 with k = 1, equal-length candidates resolved lexicographically
 */
class ShortestAndLexicographicallySmallestBeautifulString {
    public String shortestBeautifulSubstring(String s, int k) {
        int left = 0;
        int count = 0;
        int min = Integer.MAX_VALUE;
        String res = "";
        for (int right = 0; right < s.length(); right++) {
            if (s.charAt(right) == '1') {
                count++;
            }

            while (count == k) {
                if (min > right - left + 1) {
                    res = s.substring(left, right + 1);
                    min = right - left + 1;
                } else if (min == right - left + 1) {
                    String temp = s.substring(left, right + 1);
                    if (res.compareTo(temp) > 0) {
                        res = temp;
                    }
                }
                if (s.charAt(left) == '1') {
                    count--;
                }
                left++;
            }
        }

        if (min == Integer.MAX_VALUE) {
            return "";
        }
        return res;
    }
}
