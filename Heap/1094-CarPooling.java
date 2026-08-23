/**
 * 1094. Car Pooling
 * Difficulty: Medium | Tags: Array, Sorting, Heap (Priority Queue), Simulation, Prefix Sum
 * https://leetcode.com/problems/car-pooling/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
 */
class CarPooling {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] pass = new int[1001];
        for (int i = 0; i < trips.length; i++) {
            pass[trips[i][1]] = pass[trips[i][1]] + trips[i][0];
            pass[trips[i][2]] = pass[trips[i][2]] - trips[i][0];
        }
        int sum = 0;
        for (int i = 0; i < pass.length; i++) {
            sum += pass[i];
            if (sum > capacity) {
                return false;
            }
        }
        return true;
    }
}
