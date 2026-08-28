/**
 * 733. Flood Fill
 * Difficulty: Easy | Tags: Array, Depth-First Search, Breadth-First Search, Matrix
 * https://leetcode.com/problems/flood-fill/
 *
 * Pattern: BFS (Grid Flood Fill)
 * Key insight: BFS from the start cell, recoloring every same-color neighbor in the 4 directions until the connected component is fully repainted; early exit if the start already has the target color.
 *
 * Time Complexity: O(V + E) - Traverses all vertices and edges in the graph structure
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        Queue<int[]> queue = new ArrayDeque<>();
        int originalColor = image[sr][sc];
        if (originalColor == color) {
            return image;
        }

        queue.offer(new int[] { sr, sc });
        solve(queue, image, sr, sc, originalColor, color);
        image[sr][sc] = color;
        return image;

    }

    public static void solve(Queue<int[]> queue, int[][] image, int sr, int sc, int originalColor, int color) {
        int[][] dirs = {
                { -1, 0 }, { 0, -1 }, { 1, 0 }, { 0, 1 }
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
                    if (newI >= 0 && newI < image.length && newJ >= 0 && newJ < image[0].length
                            && originalColor == image[newI][newJ]) {
                        queue.offer(new int[] { newI, newJ });
                        image[newI][newJ] = color;
                    }
                }
                size--;
            }
        }
    }
}
