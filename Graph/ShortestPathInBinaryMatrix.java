/**
 * 1091. Shortest Path in Binary Matrix
 * Difficulty: Medium | Tags: Array, Breadth-First Search, Matrix
 * https://leetcode.com/problems/shortest-path-in-binary-matrix/
 *
 * Pattern: BFS (Unweighted Shortest Path on Grid)
 * Key insight: BFS explores cells in increasing distance order; store each cell's distance in the grid itself, move in 8 directions, and return the distance at the bottom-right cell.
 *
 * Time Complexity: O(V + E) - Traverses all vertices and edges in the graph structure
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
* Edge Cases Handled: null or empty grid, blocked start or end cell (returns -1), unreachable target (returns -1), single 1x1 open cell (returns 1), 8-directional boundaries
 */
class ShortestPathInBinaryMatrix {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        if (grid == null || grid.length == 0 || grid[0][0] == 1 || grid[rows - 1][cols - 1] == 1) {
            return -1;
        }

        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[] { 0, 0 });
        grid[0][0] = 1;

        int[][] dirs = {
                { -1, -1 }, { -1, 0 }, { -1, 1 },
                { 0, -1 }, { 0, 1 },
                { 1, -1 }, { 1, 0 }, { 1, 1 }
        };

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size != 0) {
                int[] temp = queue.poll();

                for (int[] dir : dirs) {
                    int i = temp[0] + dir[0];
                    int j = temp[1] + dir[1];

                    if (i >= 0 && i < rows && j >= 0 && j < cols && grid[i][j] == 0) {
                        grid[i][j] = grid[temp[0]][temp[1]] + 1;
                        queue.offer(new int[] { i, j });
                    }
                }
                size--;
            }
        }

        return grid[rows - 1][cols - 1] == 0 ? -1 : grid[rows - 1][cols - 1];
    }
}
