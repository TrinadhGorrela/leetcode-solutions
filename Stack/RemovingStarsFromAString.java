/**
 * 2390. Removing Stars From a String
 * Difficulty: Medium | Tags: String, Stack, Simulation
 * https://leetcode.com/problems/removing-stars-from-a-string/
 *
 * Pattern: String
 * Key insight: Systematically processes the input relying on string principles.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(N) - StringBuilder grows with the input size
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class RemovingStarsFromAString {
    public String removeStars(String s) {

        StringBuilder stb = new StringBuilder();
        int a = s.length();
        char c;

        for (int i = 0; i < a; i++) {
            c = s.charAt(i);
            if (c == '*') {
                if (stb.length() > 0) {
                    stb.deleteCharAt(stb.length() - 1);
                }
            } else {
                stb.append(c);

            }

        }
        return stb.toString();
    }
}
