/**
 * 3000. Maximum Area of Longest Diagonal Rectangle
 * Difficulty: Easy | Tags: Array
 * https://leetcode.com/problems/maximum-area-of-longest-diagonal-rectangle/
 *
 * Pattern: Math + Greedy
 * Key insight: For each rectangle compare the squared diagonal (avoiding a sqrt) and break ties by the larger area, tracking the best pair in one pass.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class MaximumAreaOfLongestDiagonalRectangle {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int n = dimensions.length;
        int Maxdia = 0;
        int Maxarea = 0;
        for (int i = 0; i < n; i++) {
            int l = dimensions[i][0];
            int w = dimensions[i][1];
            int dia = l * l + w * w;
            int area = l * w;
            if (dia > Maxdia) {
                Maxdia = dia;
                Maxarea = area;
            } else if (dia == Maxdia) {
                Maxarea = Math.max(area, Maxarea);
            }
        }
        return Maxarea;
    }
}
