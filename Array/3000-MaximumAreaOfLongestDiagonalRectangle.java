/**
 * 3000. Maximum Area of Longest Diagonal Rectangle
 * Difficulty: Easy | Tags: Array
 * https://leetcode.com/problems/maximum-area-of-longest-diagonal-rectangle/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
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
//   int[] res = new int[2];
//         double dia1, dia2;
//         int[] row1 = dimensions[0];
//         dia1 = row1[0] * row1[0] + row1[1] * row1[1];
//         dia1 = Math.sqrt(dia1);
//         int[] row2 = dimensions[1];
//         dia2 = row2[0] * row2[0] + row2[1] * row2[1];
//         dia2 = Math.sqrt(dia2);
//         if (dia1 > dia2) {
//             return row1[0] * row1[1];
//         }
//         return row2[0] * row2[1];
