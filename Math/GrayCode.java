/**
 * 89. Gray Code
 * Difficulty: Medium | Tags: Math, Backtracking, Bit Manipulation
 * https://leetcode.com/problems/gray-code/
 *
 * Pattern: Math
 * Key insight: Systematically processes the input via iterative doubling/mirroring of the sequence.
 *
 * Time Complexity: O(2^N) - Iterative doubling constructs the sequence
 * Space Complexity: O(2^N) - Allocates list for all Gray code permutations
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class GrayCode {
    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>();
        int bit = 1;
        res.add(0);
        for (int i = 1; i <= n; i++) {
            int size = res.size();
            for (int j = size - 1; j >= 0; j--) {
                res.add(res.get(j) + bit);
            }
            bit <<= 1;
        }
        return res;
    }
}
