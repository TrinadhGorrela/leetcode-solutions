/**
 * 2029. Stone Game IX
 * Difficulty: Medium | Tags: Array, Math, Greedy, Minimax, Counting, Game Theory, Nim Game, Zero-Sum Game
 * https://leetcode.com/problems/stone-game-ix/
 *
 * Pattern: Array
 * Key insight: Systematically processes the input relying on array principles.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(1) - Only allocates fixed-size arrays independent of input scaling
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class StoneGameIx {
    public boolean stoneGameIX(int[] stones) {

        for (int i = 0; i < stones.length; i++) {
            stones[i] = stones[i] % 3;
        }

        int[] count = new int[3];
        for (int stone : stones) {
            count[stone % 3]++;
        }

        if (count[0] % 2 == 0 && count[1] >= 1 && count[2] >= 1) {
            return true;
        } else if (count[0] % 2 != 0 && Math.abs(count[1] - count[2]) > 2) {
            return true;
        }

        return false;
    }
}
