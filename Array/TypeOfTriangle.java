/**
 * 3024. Type of Triangle
 * Difficulty: Easy | Tags: Array, Math, Sorting, Polygons
 * https://leetcode.com/problems/type-of-triangle/
 *
 * Pattern: Array
 * Key insight: Systematically processes the input relying on array principles.
 *
 * Time Complexity: O(1) - Computes the result mathematically without any iteration
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class TypeOfTriangle {
    public String triangleType(int[] nums) {
        int a = nums[0];
        int b = nums[1];
        int c = nums[2];
        if ((a + b) <= c || (a + c) <= b || (b + c) <= a)   {
            return "none";
        } else if ((a == b) && (b == c)) {
            return "equilateral";
        } else if ((a == b) || (b == c) || (c==a))   {
            return "isosceles";
        } else {
            return "scalene";
        }
    }
}
