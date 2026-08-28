/**
 * 49. Group Anagrams
 * Difficulty: Medium | Tags: Array, Hash Table, String, Sorting
 * https://leetcode.com/problems/group-anagrams/
 *
 * Pattern: Hash Table (Canonical Form)
 * Key insight: Anagrams share the same sorted character sequence; sort each word and group words by their sorted-key in a hash map.
 *
 * Time Complexity: O(N * L log L) - Sorting each string of max length L
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String temp = new String(c);
            if (!map.containsKey(temp)) {
                map.put(temp, new ArrayList<>());
            }
            map.get(temp).add(s);
        }
        List<List<String>> res=new ArrayList<>(map.values());
        return res;
    }
}
