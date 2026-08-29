/**
 * 1652. Defuse the Bomb
 * Difficulty: Easy | Tags: Array, Sliding Window
 * https://leetcode.com/problems/defuse-the-bomb/
 *
 * Pattern: Prefix Sum
 * Key insight: Duplicate the code array to handle the circular window, build a prefix sum of length 2N, and compute each window sum with O(1) prefix differences (special-case k == 0).
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(N) - Allocates an array that scales dynamically with input size
 *
 * Edge Cases Handled: k = 0 (all zeros), negative k (previous elements), circular wrap-around, single element
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
