/**
 * 1518. Water Bottles
 * Difficulty: Easy | Tags: Math, Simulation
 * https://leetcode.com/problems/water-bottles/
 *
 * Pattern: Simulation (Bottle Exchange, Fixed Rate)
 * Key insight: Repeatedly exchange full bottles back to empties: drink them, add the exchange's yield to the total, and carry forward any remainder bottles until fewer than numExchange remain.
 *
 * Time Complexity: O(log N) - Logarithmic division by exchange rate
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
* Edge Cases Handled: exact division with zero remainder, leftover remainder carried into the next exchange, fewer bottles than numExchange remaining
 */
class WaterBottles {
    public static int numWaterBottles(int numBottles, int numExchange) {
        int res=numBottles;
        while(numBottles>=numExchange){
        int t=numBottles/numExchange;
           if(numBottles%numExchange==0){
            res=res+t;
            numBottles=t;
           }
           else{
            res=res+t;
            numBottles=t+(numBottles%numExchange);
           }
        }
        return res;
    }
}
