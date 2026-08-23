/**
 * 1927. Sum Game
 * Difficulty: Medium | Tags: Math, String, Greedy, Game Theory
 * https://leetcode.com/problems/sum-game/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
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
