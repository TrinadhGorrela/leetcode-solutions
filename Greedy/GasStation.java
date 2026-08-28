/**
 * 134. Gas Station
 * Difficulty: Medium | Tags: Array, Greedy
 * https://leetcode.com/problems/gas-station/
 *
 * Pattern: Greedy (Single-Pass Start Selection)
 * Key insight: A circuit exists iff total gas >= total cost; then walk the loop and whenever the running surplus drops below zero, no earlier station can be the start, so restart from the next station.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
        }

        if (totalGas >= totalCost) {
            int start = 0;
            int curr = 0;
            for (int i = 0; i < cost.length; i++) {
                curr += gas[i] - cost[i];
                if (curr < 0) {
                    start = i + 1;
                    curr = 0;
                }
            }

            return start;
        } else {
            return -1;
        }
    }
}
