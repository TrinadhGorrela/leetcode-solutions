/**
 * 1518. Water Bottles
 * Difficulty: Easy | Tags: Math, Simulation
 * https://leetcode.com/problems/water-bottles/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
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
