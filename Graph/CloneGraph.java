/**
 * 133. Clone Graph
 * Difficulty: Medium | Tags: Hash Table, Depth-First Search, Breadth-First Search, Graph Theory
 * https://leetcode.com/problems/clone-graph/
 *
 * Pattern: DFS + Hash Map (Memoized Clone)
 * Key insight: Recursively clone each node, using a map keyed by node value to return already-cloned nodes and break cycles; each neighbor is cloned via DFS.
 *
 * Time Complexity: O(V + E) - Traverses all vertices and edges in the graph structure
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
* Edge Cases Handled: null node (returns null), self-loops and cycles (already-cloned nodes returned via map), single isolated node with no neighbors
 */
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class CloneGraph {

    public Node cloneGraph(Node node) {
        Map<Integer, Node> visited = new HashMap<>();
        return dfs(visited, node);
    }

    private Node dfs(Map<Integer, Node> visited, Node node) {
        if (node == null) {
            return null;
        }

        if (visited.containsKey(node.val)) {
            return visited.get(node.val);
        }

        Node temp = new Node(node.val);
        visited.put(node.val, temp);

        for (Node i : node.neighbors) {
            if (!visited.containsKey(i.val)) {
                temp.neighbors.add(dfs(visited, i));
            } else {
                temp.neighbors.add(visited.get(i.val));
            }
        }
        return temp;
    }
}
