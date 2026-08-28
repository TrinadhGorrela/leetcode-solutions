/**
 * 994. Rotting Oranges
 * Difficulty: Medium | Tags: Array, Breadth-First Search, Matrix
 * https://leetcode.com/problems/rotting-oranges/
 *
 * Pattern: Multi-Source BFS (Level-Order)
 * Key insight: Seed the queue with every initially rotten orange and BFS outward one level at a time, counting minutes; if any fresh orange remains after the flood, return -1.
 *
 * Time Complexity: O(V + E) - Traverses all vertices and edges in the graph structure
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class RottingOranges {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new ArrayDeque<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[] { i, j });
                }
            }
        }
        int res = solve(queue, grid);
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
            }
        }

        return res;
    }

    public static int solve(Queue<int[]> queue, int[][] grid) {
        int max = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean isRot = false;
            while (size != 0) {
                int[] arr = queue.poll();
                int i = arr[0];
                int j = arr[1];

                if (i - 1 >= 0 && grid[i - 1][j] == 1) {
                    grid[i - 1][j] = 2;
                    queue.offer(new int[] { i - 1, j });
                    isRot = true;
                }

                if (i + 1 < grid.length && grid[i + 1][j] == 1) {
                    grid[i + 1][j] = 2;
                    queue.offer(new int[] { i + 1, j });
                    isRot = true;
                }

                if (j - 1 >= 0 && grid[i][j - 1] == 1) {
                    grid[i][j - 1] = 2;
                    queue.offer(new int[] { i, j - 1 });
                    isRot = true;
                }

                if (j + 1 < grid[0].length && grid[i][j + 1] == 1) {
                    grid[i][j + 1] = 2;
                    queue.offer(new int[] { i, j + 1 });
                    isRot = true;
                }

                size--;
            }
            if (isRot) {
                max++;
            }
        }
        return max;
    }
}
