/**
 * 841. Keys and Rooms
 * Difficulty: Medium | Tags: Depth-First Search, Breadth-First Search, Graph Theory
 * https://leetcode.com/problems/keys-and-rooms/
 *
 * Pattern: BFS (Graph Reachability)
 * Key insight: BFS from room 0, opening each room whose key is found; at the end, all rooms must have been visited for full reachability.
 *
 * Time Complexity: O(V + E) - Traverses all vertices and edges in the graph structure
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<Integer> queue = new ArrayDeque<>();
        boolean[] visited = new boolean[rooms.size()];

        queue.offer(0);
        visited[0] = true;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size != 0) {
                int curr = queue.poll();

                for (int i : rooms.get(curr)) {
                    if (!visited[i]) {
                        visited[i] = true;
                        queue.offer(i);
                    }
                }
                size--;
            }
        }

        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) {
                return false;

            }
        }
        return true;
    }
}
