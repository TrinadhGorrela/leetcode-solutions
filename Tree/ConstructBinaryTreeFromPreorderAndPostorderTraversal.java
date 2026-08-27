/**
 * 889. Construct Binary Tree from Preorder and Postorder Traversal
 * Difficulty: Medium | Tags: Array, Hash Table, Divide and Conquer, Tree, Binary Tree
 * https://leetcode.com/problems/construct-binary-tree-from-preorder-and-postorder-traversal/
 *
 * Pattern: Tree Construction Hash Map
 * Key insight: Use hash map for postorder lookup to find left child bounds
 *
 * Time Complexity: O(N) - Visit each node once to construct
 * Space Complexity: O(N) - Hash map and recursion stack
 *
 * Edge Cases Handled: Per LeetCode constraints
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
class ConstructBinaryTreeFromPreorderAndPostorderTraversal {
    private static int preIndex = 0;

    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        Map<Integer, Integer> postorderMap = new HashMap<>();
        preIndex = 0;

        for (int i = 0; i < postorder.length; i++) {
            postorderMap.put(postorder[i], i);
        }
        return helper(postorderMap, preorder, postorder, 0, postorder.length - 1);
    }

    private static TreeNode helper(Map<Integer, Integer> postorderMap, int[] preorder, int[] postorder, int st,
            int end) {
        if (st > end || preIndex >= postorder.length) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[preIndex++]);

        if (st == end) {
            return root;
        }

        int leftIn = preorder[preIndex];
        int mid = postorderMap.get(leftIn);

        root.left = helper(postorderMap, preorder, postorder, st, mid);
        root.right = helper(postorderMap, preorder, postorder, mid + 1, end - 1);
        return root;
    }
}
