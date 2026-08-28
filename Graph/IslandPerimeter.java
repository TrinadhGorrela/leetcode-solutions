/**
 * 463. Island Perimeter
 * Difficulty: Easy | Tags: Array, Depth-First Search, Breadth-First Search, Matrix
 * https://leetcode.com/problems/island-perimeter/
 *
 * Pattern: Grid Counting (Per-Cell Neighbor Scan)
 * Key insight: For each land cell, its contribution to the perimeter is 4 minus the number of adjacent land cells; sum these over the whole grid.
 *
 * Time Complexity: O(rows * cols) - Iterates over the grid
 * Space Complexity: O(rows * cols) - Maintains a visited state matching grid size
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int count = 0;
		int perimeter = 0;
		boolean[][] land = new boolean[grid.length][grid[0].length];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == 1) {
					land[i][j] = true;
				} else {
					land[i][j] = false;
				}
			}
		}
		for (int s = 0; s < land.length; s++) {
			for (int t = 0; t < land[0].length; t++) {
				if (land[s][t]) {
					if (t > 0 && land[s][t - 1])
						count++;
					if (t < land[s].length - 1 && land[s][t + 1])
						count++;
					if (s > 0 && land[s - 1][t])
						count++;
					if (s < land.length - 1 && land[s + 1][t])
						count++;

					perimeter = perimeter + (4 - count);
					count = 0;
				}
			}
		}
		return perimeter;
    }
}
