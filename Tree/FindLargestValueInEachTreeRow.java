/**
 * 515. Find Largest Value in Each Tree Row
 * Difficulty: Medium | Tags: Tree, Depth-First Search, Breadth-First Search, Binary Tree
 * https://leetcode.com/problems/find-largest-value-in-each-tree-row/
 *
 * Pattern: BFS (Level Maximum)
 * Key insight: Traverse level by level, tracking the largest value seen within each level and appending it to the per-row results.
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
class FindLargestValueInEachTreeRow {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            int max = Integer.MIN_VALUE;
            while (size != 0) {
                TreeNode curr = queue.poll();
                if (max < curr.val) {
                    max = curr.val;
                }
                if (curr.left != null) {
                    queue.offer(curr.left);
                }

                if (curr.right != null) {
                    queue.offer(curr.right);
                }
                size--;
            }
            result.add(max);
        }
        return result;
    }
}
