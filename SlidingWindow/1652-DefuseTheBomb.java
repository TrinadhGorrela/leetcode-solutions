/**
 * 1652. Defuse the Bomb
 * Difficulty: Easy | Tags: Array, Sliding Window
 * https://leetcode.com/problems/defuse-the-bomb/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
 */
class DefuseTheBomb {
    public int[] decrypt(int[] code, int k) {
        int t = code.length;
        int[] prefix = new int[2 * t];
        int[] res = new int[t];
        prefix[0] = code[0];

        if (k == 0)
            return res;

        for (int i = 1; i < 2 * t; i++) {
            prefix[i] = code[i % t] + prefix[i - 1];
        }
        if (k > 0) {
            for (int i = 0; i < t; i++) {
                res[i] = prefix[i + k] - prefix[i];
            }
        } else {
            for (int i = t; i < 2 * t; i++) {
                res[i - t] = prefix[i - 1] - prefix[i + k - 1];

            }
        }
        return res;
    }
}
