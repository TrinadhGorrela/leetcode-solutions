/**
 * 2125. Number of Laser Beams in a Bank
 * Difficulty: Medium | Tags: Array, Math, String, Matrix
 * https://leetcode.com/problems/number-of-laser-beams-in-a-bank/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
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
