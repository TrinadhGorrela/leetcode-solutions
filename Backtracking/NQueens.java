/**
 * 51. N-Queens
 * Difficulty: Hard | Tags: Array, Backtracking, Algorithm X
 * https://leetcode.com/problems/n-queens/
 *
 * Pattern: Backtracking (Constraint Placement)
 * Key insight: Place a queen in each row one column at a time, rejecting columns that conflict with already-placed queens on the same column or diagonal; backtrack when no safe column remains.
 *
 * Time Complexity: O(2^N) or O(N!) - Explores combinatorial possibilities via recursion
 * Space Complexity: O(solutions * N^2) - Stores every valid full board
 *
 * Edge Cases Handled: n = 1 (single queen), small boards, column and diagonal conflict checks at board boundaries
 */
class NQueens {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        queen(board, res, n, 0);
        return res;
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
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < n; c++) {
                if (board[r][c] == 'Q') {
                    if (c == col) {
                        return false;
                    }
                    if (Math.abs(r - row) == Math.abs(c - col)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
