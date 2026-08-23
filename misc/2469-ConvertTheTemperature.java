/**
 * 2469. Convert the Temperature
 * Difficulty: Easy | Tags: Math
 * https://leetcode.com/problems/convert-the-temperature/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
 */
class ConvertTheTemperature {
    public double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double faren = celsius * 1.80 + 32.00;

        double[] tri = new double[2];
        tri[0] = kelvin;
        tri[1] = faren;
        return tri;
    }
}
