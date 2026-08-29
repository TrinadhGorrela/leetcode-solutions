/**
 * 102. Binary Tree Level Order Traversal
 * Difficulty: Medium | Tags: Tree, Breadth-First Search, Binary Tree
 * https://leetcode.com/problems/binary-tree-level-order-traversal/
 *
 * Pattern: BFS (Level-Order Traversal)
 * Key insight: Dequeue the current level's node count into a snapshot, collect those nodes into a list while enqueuing their children, yielding one list per level.
 *
 * Time Complexity: O(V + E) - Traverses all vertices and edges in the graph structure
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
 * Edge Cases Handled: empty tree / null root (returns empty list), single node, single level, skewed tree (single node per level)
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        if (root == null) {
            return result;
        }
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> temp = new ArrayList<>();
            while (size != 0) {
                TreeNode curr = queue.poll();
                temp.add(curr.val);
                if (curr.left != null) {
                    queue.offer(curr.left);
                }

                if (curr.right != null) {
                    queue.offer(curr.right);
                }
                size--;
            }
            result.add(temp);
        }
        return result;
    }
}
