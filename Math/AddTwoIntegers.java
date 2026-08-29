/**
 * 2235. Add Two Integers
 * Difficulty: Easy | Tags: Math
 * https://leetcode.com/problems/add-two-integers/
 *
 * Pattern: Direct Arithmetic
 * Key insight: The sum of two integers is returned directly by the arithmetic operator.
 *
 * Time Complexity: O(1) - Computes the result mathematically without any iteration
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
* Edge Cases Handled: zero addends, negative addends, mixed sign combinations
 */
class AddTwoIntegers {
    public int sum(int num1, int num2) {
        return num1 + num2;
    }
}
