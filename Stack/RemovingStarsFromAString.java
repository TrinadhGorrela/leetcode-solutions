/**
 * 2390. Removing Stars From a String
 * Difficulty: Medium | Tags: String, Stack, Simulation
 * https://leetcode.com/problems/removing-stars-from-a-string/
 *
 * Pattern: StringBuilder as Stack (Simulation)
 * Key insight: Append each non-star character to a StringBuilder (acting as a stack) and remove the last character when a star is read, emulating the deletion of the nearest left neighbor.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(N) - StringBuilder grows with the input size
 *
 * Edge Cases Handled: Empty string, no stars, all stars (guarded empty delete), leading star, alternating star/letter pairs
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
