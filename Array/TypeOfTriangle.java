/**
 * 3024. Type of Triangle
 * Difficulty: Easy | Tags: Array, Math, Sorting, Polygons
 * https://leetcode.com/problems/type-of-triangle/
 *
 * Pattern: Math (Triangle Inequality)
 * Key insight: Apply the triangle inequality to reject invalid sides, then classify by comparing the three side lengths (equilateral, isosceles, scalene).
 *
 * Time Complexity: O(1) - Computes the result mathematically without any iteration
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: degenerate/invalid sides (returns "none"), equilateral, isosceles (two equal sides)
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
