/**
 * 1844. Replace All Digits with Characters
 * Difficulty: Easy | Tags: String
 * https://leetcode.com/problems/replace-all-digits-with-characters/
 *
 * Pattern: Character-by-Character Shift Transformation
 * Key insight: Walk in letter/digit pairs and advance each digit's preceding letter by the digit value (c + digit), appending into a StringBuilder.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(N) - StringBuilder scales with input length
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class ReplaceAllDigitsWithCharacters {
    public String replaceDigits(String s) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2) {
            char c = s.charAt(i);
            if (i + 1 < s.length()) {
                char t = s.charAt(i + 1);
                int n = t - '0';
                res.append(c);
                res.append((char) (c + n));
            } else {
                res.append(c);
            }
        }
        return res.toString();
    }
}
