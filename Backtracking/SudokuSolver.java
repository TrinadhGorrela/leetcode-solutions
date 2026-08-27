/**
 * 37. Sudoku Solver
 * Difficulty: Hard | Tags: Array, Hash Table, Backtracking, Matrix, Algorithm X, Dancing Links
 * https://leetcode.com/problems/sudoku-solver/
 *
 * Pattern: Backtracking
 * Key insight: Systematically processes the input relying on backtracking principles.
 *
 * Time Complexity: O(2^N) or O(N!) - Explores combinatorial possibilities via recursion
 * Space Complexity: O(1) - Only allocates fixed-size arrays independent of input scaling
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class SudokuSolver {
    public void solveSudoku(char[][] board) {
        int[][] Brd = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    Brd[i][j] = 0;
                } else {
                    Brd[i][j] = board[i][j] - '0';
                }

            }
        }

        solver(Brd);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = (char) (Brd[i][j] + '0');
            }
        }
    }

    private boolean solver(int[][] Brd) {
        int row = -1;
        int col = -1;
        boolean Empty = true;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (Brd[i][j] == 0) {
                    row = i;
                    col = j;
                    Empty = false;
                    break;
                }
            }
            if (!Empty) {
                break;
            }

        }
        if (Empty)
            return true;

        for (int num = 1; num <= 9; num++) {
            if (isvalid(Brd, row, col, num)) {
                Brd[row][col] = num;
                if (solver(Brd))
                    return true;
                Brd[row][col] = 0;
            }
        }
        return false;
    }

    public static boolean isvalid(int[][] Brd, int row, int col, int num) {

        for (int i = 0; i < 9; i++) {
            if ((Brd[row][i] == num) || (Brd[i][col] == num))
                return false;
        }
        
        int srow = row - row % 3;
        int scol = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (Brd[srow + i][scol + j] == num)
                    return false;
            }

        }
        return true;
    }
}
