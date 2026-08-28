/**
 * 2596. Check Knight Tour Configuration
 * Difficulty: Medium | Tags: Array, Depth-First Search, Breadth-First Search, Matrix, Simulation
 * https://leetcode.com/problems/check-knight-tour-configuration/
 *
 * Pattern: DFS (Knight-Move Path Validation)
 * Key insight: Recursively validate that the sequence of cell values is reachable by legal knight moves: each step must be on-board, hold the expected next counter, and terminate at n*n-1.
 *
 * Time Complexity: O(N^2) - Iterates over the grid
 * Space Complexity: O(N^2) - Recursion depth equals the total number of cells visited
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class CheckKnightTourConfiguration {
    public boolean checkValidGrid(int[][] grid) {
         if (grid[0][0] != 0) 
         return false;
         
       return isValid( grid, 0, 0, grid.length, 0);
    }

    boolean isValid(int[][] grid, int r, int c, int n, int expval) {
        if (r < 0 || c < 0 || r >=n || c >=n || grid[r][c] != expval)
            return false;

        if (expval == n * n - 1)
            return true;

        boolean ans1 = isValid(grid, r - 2, c + 1, n, expval + 1);
        boolean ans2 = isValid(grid, r - 1, c + 2, n, expval + 1);
        boolean ans3 = isValid(grid, r + 1, c + 2, n, expval + 1);
        boolean ans4 = isValid(grid, r + 2, c + 1, n, expval + 1);
        boolean ans5 = isValid(grid, r + 2, c - 1, n, expval + 1);
        boolean ans6 = isValid(grid, r + 1, c - 2, n, expval + 1);
        boolean ans7 = isValid(grid, r - 1, c - 2, n, expval + 1);
        boolean ans8 = isValid(grid, r - 2, c - 1, n, expval + 1);

        return ans1 || ans2 || ans3 || ans4 || ans5 || ans6 || ans7 || ans8;
    }
}
