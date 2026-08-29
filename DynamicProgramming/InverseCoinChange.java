/**
 * 3592. Inverse Coin Change
 * Difficulty: Medium | Tags: Array, Dynamic Programming
 * https://leetcode.com/problems/inverse-coin-change/
 *
 * Pattern: 1D Dynamic Programming
 * Key insight: Reverse knapsack logic
 *
 * Time Complexity: O(C * A)
 * Space Complexity: O(A)
 *
 * Edge Cases Handled: inconsistent way-counts (t < 0 or t > 1, returns empty), empty input, single coin in list
 */
class InverseCoinChange {
    public List<Integer> findCoins(int[] numWays) {
        List<Integer> res = new ArrayList<>();
        int[] dp = new int[numWays.length + 1];
        dp[0] = 1;

        for (int i = 0; i < numWays.length; i++) {
            int ways = dp[i + 1];
            int t = numWays[i] - ways;

            if (t == 1) {
                for (int amt = i + 1; amt <= numWays.length; amt++) {
                    int rem = amt - (i + 1);
                    dp[amt] += dp[rem];

                }
                res.add(i + 1);
            } else if (t < 0 || t > 1) {
                return new ArrayList<>();
            }

        }

        return res;
    }
}
