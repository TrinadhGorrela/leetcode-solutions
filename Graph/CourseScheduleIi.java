/**
 * 210. Course Schedule II
 * Difficulty: Medium | Tags: Depth-First Search, Breadth-First Search, Graph Theory, Topological Sort
 * https://leetcode.com/problems/course-schedule-ii/
 *
 * Pattern: DFS Topological Sort
 * Key insight: Perform a DFS traversal that returns the cycle flag and pushes each fully-processed node onto a stack; popping the stack yields a valid topological order (empty if a cycle exists).
 *
 * Time Complexity: O(V + E) - Traverses all vertices and edges in the graph structure
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class CourseScheduleIi {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[numCourses];
        boolean[] recPath = new boolean[numCourses];
        
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] req : prerequisites) {
            adj.get(req[1]).add(req[0]);
        }

        for (int i = 0; i < numCourses; i++) {
            if (!visited[i]) {
                if (dfs(adj, stack, visited, recPath, i)) {
                    return new int[0];
                }
            }
        }

        int size = stack.size();
        int[] res = new int[size];
        int in = 0;

        while (size != 0) {
            res[in++] = stack.pop();
            size--;
        }

        return res;
    }

    public static boolean dfs(List<List<Integer>> adj, Stack<Integer> stack, boolean[] visited, boolean[] recPath,
            int curr) {
        visited[curr] = true;
        recPath[curr] = true;

        for (int i : adj.get(curr)) {
            if (!visited[i]) {
                if (dfs(adj, stack, visited, recPath, i)) {
                    return true;
                }
            } else if (recPath[i]) {
                return true;
            }
        }

        stack.push(curr);
        recPath[curr] = false;
        return false;
    }
}
