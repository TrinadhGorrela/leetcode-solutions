/**
 * 2138. Divide a String Into Groups of Size k
 * Difficulty: Easy | Tags: String, Simulation
 * https://leetcode.com/problems/divide-a-string-into-groups-of-size-k/
 *
 * Pattern: String
 * Key insight: Systematically processes the input relying on string principles.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(N) - Allocates array for the full re-chunked string
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class DivideAStringIntoGroupsOfSizeK {
    public String[] divideString(String s, int k, char fill) {
        int index = 0;
        int size = (s.length() + k - 1) / k;
        String[] arr = new String[size];
        for (int i = 0; i < s.length(); i = i + k) {
            String sub;
            if (i + k < s.length()) {
                sub = s.substring(i, i + k);
            } else {
                sub = s.substring(i);
                while (sub.length() < k) {
                    sub = sub + fill;
                }
            }
            arr[index] = sub;
            index++;
        }
        return arr;
    }
}
