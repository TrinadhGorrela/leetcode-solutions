/**
 * 886. Possible Bipartition
 * Difficulty: Medium | Tags: Depth-First Search, Breadth-First Search, Union-Find, Graph Theory, Graph Coloring, Bipartite Graph
 * https://leetcode.com/problems/possible-bipartition/
 *
 * Pattern: Graph Bipartition DFS
 * Key insight: Model dislikes as an undirected graph and use DFS 2-coloring to detect odd-length cycles.
 *
 * Time Complexity: O(V + E) - Each person and dislike relation is visited once during traversal
 * Space Complexity: O(V + E) - Adjacency list storage and recursion call stack
 *
 * Edge Cases Handled: Per LeetCode constraints
 */
class PossibleBipartition {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        Map<Integer, List<Integer>> adjList = new HashMap<>();
        int[] groups = new int[n + 1];

        for (int[] like : dislikes) {
            adjList.putIfAbsent(like[0], new ArrayList<>());
            adjList.putIfAbsent(like[1], new ArrayList<>());
            adjList.get(like[0]).add(like[1]);
            adjList.get(like[1]).add(like[0]);
        }

        for (int i : adjList.keySet()) {
            if (groups[i] == 0) {
                if (!helper(i, 1, adjList, groups)) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean helper(int curr, int group, Map<Integer, List<Integer>> adjList, int[] groups) {
        groups[curr] = group;

        for (int i : adjList.get(curr)) {
            if (groups[i] == 0) {
                if (!helper(i, groups[curr] == 1 ? 2 : 1, adjList, groups)) {
                    return false;
                }
            } else if (groups[i] == groups[curr]) {
                return false;
            }
        }

        return true;
    }
}
