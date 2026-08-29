/**
 * 3100. Water Bottles II
 * Difficulty: Medium | Tags: Math, Simulation
 * https://leetcode.com/problems/water-bottles-ii/
 *
 * Pattern: Simulation (Growing Exchange Rate)
 * Key insight: Drink all full bottles, converting them to empties, then exchange per the current (and incrementing) numExchange requirement until no empties remain, accumulating total drunk.
 *
 * Time Complexity: O(sqrt(N)) - numExchange grows each cycle, decreasing iterations quickly
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
* Edge Cases Handled: insufficient empties left to meet the exchange requirement (loop exits), exchange rate numExchange grows after every trade
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
