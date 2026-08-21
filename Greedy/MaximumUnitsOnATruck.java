/**
 * 1710. Maximum Units on a Truck
 * Difficulty: Easy | Tags: Array, Greedy, Sorting
 * https://leetcode.com/problems/maximum-units-on-a-truck/
 *
 * Pattern: Array
 * Key insight: Systematically processes the input relying on array principles.
 *
 * Time Complexity: O(N log N) - Dominated by the sorting operation on the input array
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
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
