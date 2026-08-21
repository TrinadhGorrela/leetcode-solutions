/**
 * 36. Valid Sudoku
 * Difficulty: Medium | Tags: Array, Hash Table, Matrix
 * https://leetcode.com/problems/valid-sudoku/
 *
 * Pattern: Array
 * Key insight: Systematically processes the input relying on array principles.
 *
 * Time Complexity: O(N^2) - Uses nested loops to process elements in quadratic time
 * Space Complexity: O(1) - Fixed 9x9 board structure
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
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
        return Valid(Brd);
    }

    private boolean Valid(int[][] Brd) {
        int row = -1;
        int col = -1;
        int num = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                num = Brd[i][j];
                if (num != 0) {
                    Brd[i][j] = 0;
                    row = i;
                    col = j;
                    if (!isSafe(Brd, row, col, num))
                        return false;
                    Brd[i][j] = num;
                }
            }
        }
        return true;
    }

    public boolean isSafe(int[][] Brd, int row, int col, int num) {

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
