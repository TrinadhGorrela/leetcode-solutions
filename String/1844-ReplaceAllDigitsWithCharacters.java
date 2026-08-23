/**
 * 1844. Replace All Digits with Characters
 * Difficulty: Easy | Tags: String
 * https://leetcode.com/problems/replace-all-digits-with-characters/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
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
