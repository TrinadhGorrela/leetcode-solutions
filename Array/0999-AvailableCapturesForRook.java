/**
 * 999. Available Captures for Rook
 * Difficulty: Easy | Tags: Array, Matrix, Simulation
 * https://leetcode.com/problems/available-captures-for-rook/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
 */
class AvailableCapturesForRook {
    public int numRookCaptures(char[][] board) {
        int x = -1, y = -1;
        boolean found = false;
        for (int i = 0; i < 8 && !found; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 'R') {
                    x = i;
                    y = j;
                    found = true;
                    break;
                }

            }
        }
        return captures(x, y, board);
    }

    public int captures(int r, int c, char[][] board) {
        int z = 0;
        for (int i = c - 1; i >= 0; i--) {
            if (board[r][i] == 'B')
                break;
            if (board[r][i] == 'p') {
                z++;
                break;
            }
        }

        for (int i = c + 1; i < 8; i++) {
            if (board[r][i] == 'B')
                break;
            if (board[r][i] == 'p') {
                z++;
                break;
            }
        }

        for (int i = r + 1; i < 8; i++) {
            if (board[i][c] == 'B')
                break;
            if (board[i][c] == 'p') {
                z++;
                break;
            }
        }

        for (int i = r - 1; i >= 0; i--) {
            if (board[i][c] == 'B')
                break;
            if (board[i][c] == 'p') {
                z++;
                break;
            }
        }

        return z;

    }
}
