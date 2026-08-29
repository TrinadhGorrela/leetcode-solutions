/**
 * 2469. Convert the Temperature
 * Difficulty: Easy | Tags: Math
 * https://leetcode.com/problems/convert-the-temperature/
 *
 * Pattern: Unit Conversion Formula
 * Key insight: Apply the fixed Celsius-to-Kelvin and Celsius-to-Fahrenheit formulas and return both results in an array.
 *
 * Time Complexity: O(1) - Computes the result mathematically without any iteration
 * Space Complexity: O(1) - Only allocates fixed-size arrays independent of input scaling
 *
* Edge Cases Handled: zero celsius (breaks even at 273.15 K / 32 F), negative celsius, fractional celsius (decimal arithmetic preserved)
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
