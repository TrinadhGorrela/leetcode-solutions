/**
 * 802. Find Eventual Safe States
 * Difficulty: Medium | Tags: Depth-First Search, Breadth-First Search, Graph Theory, Topological Sort, Kosaraju's Algorithm, Tarjan's SCC Algorithm
 * https://leetcode.com/problems/find-eventual-safe-states/
 *
 * Pattern: Depth-First Search
 * Key insight: Systematically processes the input relying on depth-first search principles.
 *
 * Time Complexity: O(V + E) - Traverses all vertices and edges in the graph structure
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class FindEventualSafeStates {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> res = new ArrayList<>();
        boolean[] visited = new boolean[graph.length];
        boolean[] recPath = new boolean[graph.length];
        boolean[] safe = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                dfs(graph, visited, recPath, safe, i);
            }
        }

        for (int i = 0; i < safe.length; i++) {
            if (safe[i]) {
                res.add(i);
            }
        }
        return res;
    }

    public static boolean dfs(int[][] graph, boolean[] visited, boolean[] recPath, boolean[] safe, int curr) {
        visited[curr] = true;
        recPath[curr] = true;

        for (int i : graph[curr]) {
            if (!visited[i]) {
                if (dfs(graph, visited, recPath, safe, i)) {
                    return true;
                }
            } else if (recPath[i]) {
                return true;
            }
        }
        recPath[curr] = false;
        safe[curr] = true;
        return false;
    }
}
