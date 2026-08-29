/**
 * 763. Partition Labels
 * Difficulty: Medium | Tags: Hash Table, Two Pointers, String, Greedy
 * https://leetcode.com/problems/partition-labels/
 *
 * Pattern: Greedy + Two Pointers (Last Occurrence Scan)
 * Key insight: Record each character's last index, then sweep the string extending the current partition's end to the max last-index seen; close a partition when the sweep reaches that end.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(1) - Bounded by lowercase alphabet size (26)
 *
 * Edge Cases Handled: single character (one partition), all identical characters (single partition), all unique characters (each its own partition of length 1)
 */
class PartitionLabels {
    public List<Integer> partitionLabels(String s) {
        Map<Character, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), i);
        }

        int st = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, map.get(s.charAt(i)));

            if (end == i) {
                list.add(end - st + 1);
                st = i + 1;
            }
        }
        return list;
    }
}
