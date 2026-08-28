/**
 * 199. Binary Tree Right Side View
 * Difficulty: Medium | Tags: Tree, Depth-First Search, Breadth-First Search, Binary Tree
 * https://leetcode.com/problems/binary-tree-right-side-view/
 *
 * Pattern: BFS (Rightmost Node per Level)
 * Key insight: Traverse level by level and capture the last node visited in each level after enqueuing both children, collecting the right-side view.
 *
 * Time Complexity: O(V + E) - Traverses all vertices and edges in the graph structure
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
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
class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        if (root == null) {
            return result;
        }
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size != 0) {
                TreeNode curr = queue.poll();

                if (curr.left != null) {
                    queue.offer(curr.left);
                }

                if (curr.right != null) {
                    queue.offer(curr.right);
                }
                if (size == 1) {
                    result.add(curr.val);
                }
                size--;
            }
        }
        return result;
    }
}
