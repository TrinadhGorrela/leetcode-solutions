/**
 * 89. Gray Code
 * Difficulty: Medium | Tags: Math, Backtracking, Bit Manipulation
 * https://leetcode.com/problems/gray-code/
 *
 * Pattern: Bit Manipulation (Mirror Doubling / Binary Reflected Gray Code)
 * Key insight: Construct the n-bit Gray code by reflecting the current sequence and adding the new high bit, using the iteration results via bit doubling to keep consecutive values differing in one bit.
 *
 * Time Complexity: O(2^N) - Iterative doubling constructs the sequence
 * Space Complexity: O(2^N) - Allocates list for all Gray code permutations
 *
* Edge Cases Handled: n = 0 (sequence is just [0]), mirror reflection preserves the one-bit difference across the boundary
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
