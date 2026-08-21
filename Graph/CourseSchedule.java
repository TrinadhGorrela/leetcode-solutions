/**
 * 207. Course Schedule
 * Difficulty: Medium | Tags: Depth-First Search, Breadth-First Search, Graph Theory, Topological Sort, Directed Acyclic Graph
 * https://leetcode.com/problems/course-schedule/
 *
 * Pattern: Depth-First Search
 * Key insight: Systematically processes the input relying on depth-first search principles.
 *
 * Time Complexity: O(V + E) - Traverses all vertices and edges in the graph structure
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        boolean[] visited = new boolean[numCourses + 1];
        boolean[] recPath = new boolean[numCourses + 1];

        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] req : prerequisites) {
            adj.get(req[1]).add(req[0]);
        }

        for (int i = 0; i < numCourses; i++) {
            if (!visited[i]) {
                if (dfs(adj, visited, recPath, i)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean dfs(List<List<Integer>> adj, boolean[] visited, boolean[] recPath, int curr) {
        visited[curr] = true;
        recPath[curr] = true;

        for (int i : adj.get(curr)) {
            if (!visited[i]) {
                if (dfs(adj, visited, recPath, i)) {
                    return true;
                }
            } else if (recPath[i]) {
                return true;
            }
        }

        recPath[curr] = false;
        return false;
    }
}
