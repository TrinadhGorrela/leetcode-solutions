/**
 * 52. N-Queens II
 * Difficulty: Hard | Tags: Backtracking, Algorithm X
 * https://leetcode.com/problems/n-queens-ii/
 *
 * Pattern: Backtracking (Constraint Placement)
 * Key insight: Same N-Queens solution as the full-board variant, but only the total count is returned by checking column, main-diagonal, and anti-diagonal conflicts per placement.
 *
 * Time Complexity: O(2^N) or O(N!) - Explores combinatorial possibilities via recursion
 * Space Complexity: O(N^2) - Allocates an N x N board array
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class NQueensIi {
    public int totalNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        queen(board, res, n, 0);
        return res.size();
    }

    public void queen(char[][] board, List<List<String>> res, int n, int row) {
        if (row == n) {
            List<String> solution = new ArrayList<>();
            for (char[] line : board) {
                solution.add(new String(line));
            }
            res.add(solution);
            return;
        }
        for (int col = 0; col < n; col++) {
            if (issafe(board, row, col, n)) {
                board[row][col] = 'Q';
                queen(board, res, n, row + 1);
                board[row][col] = '.';
            }
        }
    }

    public boolean issafe(char[][] board, int row, int col, int n) {
        for (int i = 0; i < n; i++) {
            if (board[i][col] == 'Q')
                return false;
        }

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }

        return true;
    }
}
