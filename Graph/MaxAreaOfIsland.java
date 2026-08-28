/**
 * 695. Max Area of Island
 * Difficulty: Medium | Tags: Array, Depth-First Search, Breadth-First Search, Union-Find, Matrix
 * https://leetcode.com/problems/max-area-of-island/
 *
 * Pattern: BFS (Grid Connected Components)
 * Key insight: BFS each unvisited land cell to measure its island area, marking visited to avoid recounting, and keep the maximum area found.
 *
 * Time Complexity: O(V + E) - Traverses all vertices and edges in the graph structure
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class MaxAreaOfIsland {
    public int maxAreaOfIsland(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> queue = new ArrayDeque<>();
        boolean[][] visited = new boolean[rows][cols];
        int res = 0;
        for (int i = 0; i < visited.length; i++) {
            for (int j = 0; j < visited[i].length; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    queue.offer(new int[] { i, j });
                    visited[i][j] = true;
                    res = Math.max(res, bfs(queue, visited, grid));
                }
            }
        }
        return res;
    }

    private int bfs(Queue<int[]> queue, boolean[][] visited, int[][] grid) {
        int[][] dirs = {
                { 0, -1 }, { -1, 0 }, { 0, 1 }, { 1, 0 }
        };
        int res = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size != 0) {
                int[] temp = queue.poll();
                int i = temp[0];
                int j = temp[1];

                for (int[] dir : dirs) {
                    int newI = i + dir[0];
                    int newJ = j + dir[1];

                    if (newI >= 0 && newI < grid.length && newJ >= 0 && newJ < grid[0].length
                            && grid[newI][newJ] == 1 && !visited[newI][newJ]) {
                        queue.offer(new int[] { newI, newJ });
                        visited[newI][newJ] = true;
                        res++;
                    }
                }
                size--;
            }
        }

        return res;
    }
}
