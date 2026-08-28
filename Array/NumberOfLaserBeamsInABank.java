/**
 * 2125. Number of Laser Beams in a Bank
 * Difficulty: Medium | Tags: Array, Math, String, Matrix
 * https://leetcode.com/problems/number-of-laser-beams-in-a-bank/
 *
 * Pattern: Math + Greedy
 * Key insight: Beams form only between consecutive rows that each contain a device; multiply the device counts of adjacent non-empty rows and accumulate.
 *
 * Time Complexity: O(total characters across all rows) - Linear scan over character strings
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class NumberOfLaserBeamsInABank {
    public int numberOfBeams(String[] bank) {
        int prev = 0;
        int curr = 0;
        int res = 0;
        for (int i = 0; i < bank.length; i++) {
            String s = bank[i];
            for (char t : s.toCharArray()) {
                if (t == '1') {
                    curr++;
                }
            }

            if (prev != 0 && curr != 0) {
                res += prev * curr;
                prev = curr;
                curr = 0;
            }

            if (curr != 0) {
                prev = curr;
                curr = 0;
            }
        }

        return res;
    }
}
