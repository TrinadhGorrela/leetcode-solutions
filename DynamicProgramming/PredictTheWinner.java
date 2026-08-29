/**
 * 486. Predict the Winner
 * Difficulty: Medium | Tags: Array, Math, Dynamic Programming, Recursion, Minimax, Game Theory, Zero-Sum Game
 * https://leetcode.com/problems/predict-the-winner/
 *
 * Pattern: Dynamic Programming (Minimax, Interval DP)
 * Key insight: The current player's score minus the optimal opponent score from the remaining interval is maximized; memoize state (start, end) to avoid recomputation.
 *
 * Time Complexity: O(N^2) - 2D memoization has N^2 states
 * Space Complexity: O(N^2) - Allocates a 2D array for memoization
 *
 * Edge Cases Handled: single element (st == end), even-length packs (guaranteed win), all equal values (tie)
 */
class PredictTheWinner {
    public boolean predictTheWinner(int[] nums) {
        int[][] res = new int[nums.length][nums.length];

        for (int[] i : res) {
            Arrays.fill(i, -1);
        }

        return solve(res, nums, 0, nums.length - 1) >= 0;
    }

    public static int solve(int[][] res, int[] nums, int st, int end) {
        if (st >= end) {
            return nums[st];
        }

        if (res[st][end] != -1) {
            return res[st][end];
        }

        int left = nums[st] - solve(res, nums, st + 1, end);
        int right = nums[end] - solve(res, nums, st, end - 1);
        res[st][end] = Math.max(left, right);
        return res[st][end];
    }
}
