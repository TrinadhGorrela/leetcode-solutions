/**
 * 767. Reorganize String
 * Difficulty: Medium | Tags: Hash Table, String, Greedy, Sorting, Heap (Priority Queue), Counting
 * https://leetcode.com/problems/reorganize-string/
 *
 * Pattern: Even-Index Staggering Greedy
 * Key insight: Place the most frequent character on all even indices (0, 2, 4…) first; this is always possible if its count ≤ ⌈n/2⌉. Remaining characters fill odd indices then overflow to remaining evens — no two adjacent characters match.
 *
 * Time Complexity: O(N) - Counting pass O(N) + two filling passes over the result array
 * Space Complexity: O(N) - Result char array of length N
 *
 * Edge Cases Handled: most frequent character count > ⌈n/2⌉ (returns "", impossible to separate), single character (returns as-is), all unique characters (alternating placement), even vs odd length (fill indices wrap correctly)
 */
class ReorganizeString {
    public String reorganizeString(String s) {
        Map<Character, Integer> freq = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i), 0) + 1);
        }

        int maxCount = 0;
        int mostFrequentChar = 0;

        for (char i : freq.keySet()) {
            if (maxCount < freq.get(i)) {
                maxCount = freq.get(i);
                mostFrequentChar = i;
            }
        }

        char[] res = new char[s.length()];
        int index = 0;

        if (maxCount > (s.length() + 1) / 2) {
            return "";
        }
        
        while (maxCount > 0) {
            res[index] = (char) mostFrequentChar;
            index += 2;
            maxCount--;
        }

        for (char i : freq.keySet()) {
            int remaining = freq.get(i);
            while (remaining > 0) {
                if (i != mostFrequentChar) {
                    if (index >= s.length()) {
                        index = 1;
                    }
                    res[index] = (char) i;
                    index += 2;
                }
                remaining--;
            }
        }

        return new String(res);
    }
}
