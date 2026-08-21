/**
 * 205. Isomorphic Strings
 * Difficulty: Easy | Tags: Hash Table, String
 * https://leetcode.com/problems/isomorphic-strings/
 *
 * Pattern: Hash Table
 * Key insight: Systematically processes the input relying on hash table principles.
 *
 * Time Complexity: O(N^2) - Iterates over elements, containsValue takes O(N)
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> iso = new HashMap<>();
        if (s.length() != t.length())
            return false;
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (iso.containsKey(c1)) {
                if (iso.get(c1) != c2) {
                    return false; 
                }
            } else {
                if (iso.containsValue(c2)) {
                    return false; 
                }
                iso.put(c1, c2);
            }

        }
        return true;
    }
}
