/**
 * 200. Number of Islands
 * Difficulty: Medium | Tags: Array, Depth-First Search, Breadth-First Search, Union-Find, Matrix
 * https://leetcode.com/problems/number-of-islands/
 *
 * Pattern: BFS (Grid Connected Components)
 * Key insight: Scan the grid; each time an unvisited '1' is found, increment the island count and BFS-flood its entire connected component of 1s marking them visited.
 *
 * Time Complexity: O(V + E) - Traverses all vertices and edges in the graph structure
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class NumberOfIslands {
    public int numIslands(char[][] grid) {
        Queue<int[]> queue = new ArrayDeque<>();
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    res++;
                    visited[i][j] = true;
                    queue.offer(new int[] { i, j });
                    solve(queue, grid, visited);
                }
            }
        }
        return res;
    }

    public static void solve(Queue<int[]> queue, char[][] grid, boolean[][] visited) {
        int[][] dirs = {
                { 0, -1 }, { -1, 0 }, { 0, 1 }, { 1, 0 }
        };
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size != 0) {
                int[] temp = queue.poll();
                int i = temp[0];
                int j = temp[1];
                for (int[] dir : dirs) {
                    int newI = i + dir[0];
                    int newJ = j + dir[1];

                    if (newI >= 0 && newI < grid.length && newJ >= 0 && newJ < grid[0].length && grid[newI][newJ] == '1'
                            && !visited[newI][newJ]) {
                        visited[newI][newJ] = true;
                        queue.offer(new int[] { newI, newJ });
                    }
                }
                size--;
            }
        }
    }
}
