/**
 * 3024. Type of Triangle
 * Difficulty: Easy | Tags: Array, Math, Sorting, Polygons
 * https://leetcode.com/problems/type-of-triangle/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
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
