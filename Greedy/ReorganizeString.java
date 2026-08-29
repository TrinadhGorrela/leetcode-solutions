/**
 * 767. Reorganize String
 * Difficulty: Medium | Tags: Hash Table, String, Greedy, Sorting, Heap (Priority Queue), Counting
 * https://leetcode.com/problems/reorganize-string/
 *
 * Pattern: Greedy + Counting (Frequency Staggering)
 * Key insight: Stagger the most frequent character at even indices first (impossible if its count exceeds ceil(n/2)), then fill the remaining slots with the other characters.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(N) - Allocates character array proportional to input string
 *
 * Edge Cases Handled: single character, all identical characters (returns ""), most frequent char count > ceil(n/2) (returns ""), odd vs even length filling (wrap to index 1)
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
