/**
 * 1094. Car Pooling
 * Difficulty: Medium | Tags: Array, Sorting, Heap (Priority Queue), Simulation, Prefix Sum
 * https://leetcode.com/problems/car-pooling/
 *
 * Pattern: Array
 * Key insight: Systematically processes the input relying on array principles.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(1) - Only allocates fixed-size arrays independent of input scaling
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
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
