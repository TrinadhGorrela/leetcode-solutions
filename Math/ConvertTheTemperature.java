/**
 * 2469. Convert the Temperature
 * Difficulty: Easy | Tags: Math
 * https://leetcode.com/problems/convert-the-temperature/
 *
 * Pattern: Math
 * Key insight: Systematically processes the input relying on math principles.
 *
 * Time Complexity: O(1) - Computes the result mathematically without any iteration
 * Space Complexity: O(1) - Only allocates fixed-size arrays independent of input scaling
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
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
