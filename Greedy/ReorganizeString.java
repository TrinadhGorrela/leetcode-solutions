/**
 * 767. Reorganize String
 * Difficulty: Medium | Tags: Hash Table, String, Greedy, Sorting, Heap (Priority Queue), Counting
 * https://leetcode.com/problems/reorganize-string/
 *
 * Pattern: Hash Table
 * Key insight: Systematically processes the input relying on hash table principles.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(N) - Allocates character array proportional to input string
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class ReorganizeString {
    public String reorganizeString(String s) {
        Map<Character, Integer> freq = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i), 0) + 1);
        }

        int max = 0;
        int l = 0;

        for (char i : freq.keySet()) {
            if (max < freq.get(i)) {
                max = freq.get(i);
                l = i;
            }
        }

        char[] res = new char[s.length()];
        int in = 0;

        if (max > (s.length() + 1) / 2) {
            return "";
        }
        
        while (max > 0) {
            res[in] = (char) l;
            in += 2;
            max--;
        }

        for (char i : freq.keySet()) {
            int t = freq.get(i);
            while (t > 0) {
                if (i != l) {
                    if (in >= s.length()) {
                        in = 1;
                    }
                    res[in] = (char) i;
                    in += 2;
                }
                t--;
            }
        }

        return new String(res);
    }
}
