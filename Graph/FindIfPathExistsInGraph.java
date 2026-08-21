/**
 * 1971. Find if Path Exists in Graph
 * Difficulty: Easy | Tags: Depth-First Search, Breadth-First Search, Union-Find, Graph Theory
 * https://leetcode.com/problems/find-if-path-exists-in-graph/
 *
 * Pattern: Breadth-First Search
 * Key insight: Systematically processes the input relying on breadth-first search principles.
 *
 * Time Complexity: O(V + E) - Traverses all vertices and edges in the graph structure
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class FindIfPathExistsInGraph {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] i : edges) {
            addEdge(graph, i[0], i[1]);
        }

        Queue<Integer> queue = new ArrayDeque<>();
        Set<Integer> visited = new HashSet<>();
        queue.offer(source);
        visited.add(source);

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size != 0) {
                int curr = queue.poll();

                if (curr == destination) {
                    return true;
                }

                for (int i : graph.get(curr)) {
                    if (!visited.contains(i)) {
                        queue.offer(i);
                        visited.add(i);
                    }
                }
                size--;
            }
        }
        return false;
    }

    static void addEdge(List<List<Integer>> graph, int u, int v) {
        List<Integer> temp1 = graph.get(u);
        List<Integer> temp2 = graph.get(v);
        temp1.add(v);
        temp2.add(u);
    }
}
