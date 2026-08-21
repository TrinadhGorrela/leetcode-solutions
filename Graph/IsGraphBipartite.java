/**
 * 785. Is Graph Bipartite?
 * Difficulty: Medium | Tags: Depth-First Search, Breadth-First Search, Union-Find, Graph Theory, Graph Coloring, Bipartite Graph
 * https://leetcode.com/problems/is-graph-bipartite/
 *
 * Pattern: Depth-First Search
 * Key insight: Systematically processes the input relying on depth-first search principles.
 *
 * Time Complexity: O(V + E) - Traverses all vertices and edges in the graph structure
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class IsGraphBipartite {
    public boolean isBipartite(int[][] graph) {
        Queue<Integer> queue = new ArrayDeque<>();
        int[] color = new int[graph.length];
        Arrays.fill(color, -1);

        for (int i = 0; i < color.length; i++) {
            if (color[i] == -1) {
                if (!check(i, 0, graph, color)) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean check(int node, int nodeColor, int[][] graph, int[] color) {
        color[node] = nodeColor;

        for (int i : graph[node]) {
            if (color[i] == -1) {
                if (!check(i, color[node] == 0 ? 1 : 0, graph, color)) {
                    return false;
                }
            } else if (color[node] == color[i]) {
                return false;
            }
        }
        return true;
    }
}

