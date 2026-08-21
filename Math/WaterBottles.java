/**
 * 1518. Water Bottles
 * Difficulty: Easy | Tags: Math, Simulation
 * https://leetcode.com/problems/water-bottles/
 *
 * Pattern: Math
 * Key insight: Systematically processes the input relying on math principles.
 *
 * Time Complexity: O(log N) - Logarithmic division by exchange rate
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
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
