/**
 * 438. Find All Anagrams in a String
 * Difficulty: Medium | Tags: Hash Table, String, Sliding Window
 * https://leetcode.com/problems/find-all-anagrams-in-a-string/
 *
 * Pattern: Hash Table
 * Key insight: Systematically processes the input relying on hash table principles.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(1) - Frequency arrays have a fixed size of 26
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class FindAllAnagramsInAString {
    public List<Integer> findAnagrams(String s, String t) {
        int[] freqS = new int[26];
        int[] freqT = new int[26];
        List<Integer> res = new ArrayList<>();

        if (s.length() < t.length()) {
            return res;
        }

        for (int i = 0; i < t.length(); i++) {
            freqS[s.charAt(i) - 'a']++;
            freqT[t.charAt(i) - 'a']++;
        }

        if (Arrays.compare(freqS, freqT) == 0) {
            res.add(0);
        }

        for (int i = t.length(); i < s.length(); i++) {
            freqS[s.charAt(i - t.length()) - 'a']--;
            freqS[s.charAt(i) - 'a']++;
            if (Arrays.compare(freqS, freqT) == 0) {
                res.add(i - t.length() + 1);
            }
        }
        return res;
    }
}
