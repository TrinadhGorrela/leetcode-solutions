/**
 * 498. Diagonal Traverse
 * Difficulty: Medium | Tags: Array, Matrix, Simulation
 * https://leetcode.com/problems/diagonal-traverse/
 *
 * Pattern: Hash Map (Diagonal Grouping)
 * Key insight: Group cells by the constant i+j (each group is one diagonal), then emit groups in order, reversing alternate diagonals to achieve the zig-zag traversal.
 *
 * Time Complexity: O(M*N) - Visits every matrix element once
 * Space Complexity: O(M * N) - Map stores all matrix elements
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int m = mat.length;
        int n = mat[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!map.containsKey(i + j)) {
                    map.put(i + j, new ArrayList<>());
                }
                map.get(i + j).add(mat[i][j]);
            }
        }

        int[] res = new int[m * n];
        int in = 0;
        int maxKey = (m - 1) + (n - 1);
        boolean flip = true;

        for (int k = 0; k <= maxKey; k++) {
            List<Integer> curr = map.get(k);

            if (flip) {
                Collections.reverse(curr);
            }
            for (int j = 0; j < curr.size(); j++) {
                res[in++] = curr.get(j);
            }

            flip = !flip;
        }
        return res;
    }
}
