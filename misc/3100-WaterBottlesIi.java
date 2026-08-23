/**
 * 3100. Water Bottles II
 * Difficulty: Medium | Tags: Math, Simulation
 * https://leetcode.com/problems/water-bottles-ii/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
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
