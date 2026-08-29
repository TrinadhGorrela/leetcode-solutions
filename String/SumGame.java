/**
 * 1927. Sum Game
 * Difficulty: Medium | Tags: Math, String, Greedy, Game Theory
 * https://leetcode.com/problems/sum-game/
 *
 * Pattern: Game Theory (Parity + Pair Mirroring)
 * Key insight: If the total number of '?' is odd Alice moves last and wins; with an even count, Bob mirrors paired '?'s on both sides, so Alice wins only when the surplus question marks on one side (driving by 9 per paired excess) cannot be balanced to equal half-sums.
 *
 * Time Complexity: O(N) - Single linear scan over the string
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Odd number of '?' (Alice wins), no '?' present, balanced '?' counts and digit sums (Bob wins), single '?'
 */
class SumGame {
    public boolean sumGame(String num) {
        int leftSum = 0;
        int rightSum = 0;
        int leftCount = 0;
        int rightCount = 0;

        for (int i = 0; i < num.length() / 2; i++) {
            if (num.charAt(i) == '?') {
                leftCount++;
            } else {
                leftSum += num.charAt(i) - '0';
            }
        }

        for (int i = num.length() / 2; i < num.length(); i++) {
            if (num.charAt(i) == '?') {
                rightCount++;
            } else {
                rightSum += num.charAt(i) - '0';
            }
        }

        if ((leftCount + rightCount) % 2 != 0) {
            return true;
        }

        if (leftSum == rightSum && leftCount == rightCount) {
            return false;
        }

        int diff = Math.abs(leftCount - rightCount);

        if (leftCount > rightCount) {
            leftSum += (diff / 2) * 9;
        } else {
            rightSum += (diff / 2) * 9;
        }

        if (leftSum == rightSum) {
            return false;
        }

        return true;
    }
}
