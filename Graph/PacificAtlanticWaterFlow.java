/**
 * 417. Pacific Atlantic Water Flow
 * Difficulty: Medium | Tags: Array, Depth-First Search, Breadth-First Search, Matrix
 * https://leetcode.com/problems/pacific-atlantic-water-flow/
 *
 * Pattern: BFS (Reverse Flow from Oceans)
 * Key insight: BFS inward from every border cell touching an ocean, moving to equal-or-higher cells; a cell that is reachable from both oceans in its respective pass can drain to both.
 *
 * Time Complexity: O(V + E) - Traverses all vertices and edges in the graph structure
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
* Edge Cases Handled: null or empty grid (returns empty list), single-cell grid touching both oceans, cells on the shared border reachable from both passes, monotonic equal-height flows
 */
class PacificAtlanticWaterFlow {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList<>();

        if (heights == null || heights.length == 0 || heights[0].length == 0) {
            return result;
        }

        int rows = heights.length;
        int cols = heights[0].length;

        boolean[][] pacificReachable = new boolean[rows][cols];
        boolean[][] atlanticReachable = new boolean[rows][cols];

        Queue<int[]> queue = new ArrayDeque<>();

        for (int i = 0; i < cols; i++) {
            queue.offer(new int[] { 0, i });
            pacificReachable[0][i] = true;
        }

        for (int i = 0; i < rows; i++) {
            queue.offer(new int[] { i, 0 });
            pacificReachable[i][0] = true;
        }
        solve(pacificReachable, heights, queue);

        for (int i = 0; i < cols; i++) {
            queue.offer(new int[] { rows - 1, i });
            atlanticReachable[rows - 1][i] = true;
        }

        for (int i = 0; i < rows; i++) {
            queue.offer(new int[] { i, cols - 1 });
            atlanticReachable[i][cols - 1] = true;
        }
        solve(atlanticReachable, heights, queue);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (pacificReachable[i][j] && atlanticReachable[i][j]) {
                    result.add(Arrays.asList(i, j));
                }
            }
        }
        return result;
    }

    public static void solve(boolean[][] reachable, int[][] heights, Queue<int[]> queue) {
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size != 0) {
                int[] temp = queue.poll();
                int i = temp[0];
                int j = temp[1];
                if (i - 1 >= 0 && heights[i][j] <= heights[i - 1][j] && !reachable[i - 1][j]) {
                    reachable[i - 1][j] = true;
                    queue.offer(new int[] { i - 1, j });
                }

                if (i + 1 < heights.length && heights[i][j] <= heights[i + 1][j] && !reachable[i + 1][j]) {
                    reachable[i + 1][j] = true;
                    queue.offer(new int[] { i + 1, j });
                }

                if (j - 1 >= 0 && heights[i][j] <= heights[i][j - 1] && !reachable[i][j - 1]) {
                    reachable[i][j - 1] = true;
                    queue.offer(new int[] { i, j - 1 });
                }

                if (j + 1 < heights[0].length && heights[i][j] <= heights[i][j + 1] && !reachable[i][j + 1]) {
                    reachable[i][j + 1] = true;
                    queue.offer(new int[] { i, j + 1 });
                }

                size--;
            }
        }
    }
}
