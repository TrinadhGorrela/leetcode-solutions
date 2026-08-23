/**
 * 1710. Maximum Units on a Truck
 * Difficulty: Easy | Tags: Array, Greedy, Sorting
 * https://leetcode.com/problems/maximum-units-on-a-truck/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
 */
class MaximumUnitsOnATruck {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        int total = 0;
        for (int i = 0; i < boxTypes.length; i++) {
            int box = boxTypes[i][0];
            int units = boxTypes[i][1];
            if (truckSize >= box) {
                truckSize -= box;
                total += box * units;
            } else {
                total += truckSize * units;
                break;
            }
        }
        return total;
    }
}
