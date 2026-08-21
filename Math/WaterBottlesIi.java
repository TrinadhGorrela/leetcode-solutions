/**
 * 3100. Water Bottles II
 * Difficulty: Medium | Tags: Math, Simulation
 * https://leetcode.com/problems/water-bottles-ii/
 *
 * Pattern: Math
 * Key insight: Systematically processes the input relying on math principles.
 *
 * Time Complexity: O(sqrt(N)) - numExchange grows each cycle, decreasing iterations quickly
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class WaterBottlesIi {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int fullBottles = numBottles, empty = 0, BottlesDrunk = 0;
        while (fullBottles > 0) {

            empty = empty + fullBottles;
            BottlesDrunk = BottlesDrunk + fullBottles;
            fullBottles = 0;

            while (empty >= numExchange) {
                empty = empty - numExchange;
                fullBottles++;
                numExchange++;
            }

        }
        return BottlesDrunk;
    }
}
