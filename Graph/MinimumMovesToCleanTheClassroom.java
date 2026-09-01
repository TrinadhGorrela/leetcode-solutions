/**
 * 3568. Minimum Moves to Clean the Classroom
 * Difficulty: Medium | Tags: Array, Hash Table, Bit Manipulation, Breadth-First Search, Matrix
 * https://leetcode.com/problems/minimum-moves-to-clean-the-classroom/
 *
 * Pattern:
 * Key insight:
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
 */
class MinimumMovesToCleanTheClassroom {
    public int minMoves(String[] classroom, int energy) {
        int rows = classroom.length;
        int cols = classroom[0].length();

        int[][] litterNumber = new int[rows][cols];
        int startRow = 0;
        int startCol = 0;
        int totalLitter = 0;

        for (int[] litter : litterNumber) {
            Arrays.fill(litter, -1);
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                char c = classroom[i].charAt(j);

                if (c == 'S') {
                    startRow = i;
                    startCol = j;
                }

                if (c == 'L') {
                    litterNumber[i][j] = totalLitter;
                    totalLitter++;
                }
            }
        }

        int allLitter = (1 << totalLitter) - 1;

        Queue<int[]> queue = new ArrayDeque<>();

        boolean[][][][] visited = new boolean[rows][cols][energy + 1][(1 << totalLitter)];
        queue.offer(new int[] { startRow, startCol, energy, 0 });

        visited[startRow][startCol][energy][0] = true;

        int[][] dirs = { { 0, -1 }, { -1, 0 }, { 0, 1 }, { 1, 0 } };
        int move = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- != 0) {
                int[] curr = queue.poll();
                if (allLitter == curr[3]) {
                    return move;
                }

                if (curr[2] == 0) {
                    continue;
                }

                for (int[] dir : dirs) {
                    int i = curr[0] + dir[0];
                    int j = curr[1] + dir[1];

                    if (i >= 0 && i < rows && j >= 0 && j < cols && classroom[i].charAt(j) != 'X') {
                        int newEnergy = curr[2] - 1;
                        int newMask = curr[3];

                        char c = classroom[i].charAt(j);

                        if (c == 'R') {
                            newEnergy = energy;
                        }

                        if (c == 'L') {
                            int litterNum = litterNumber[i][j];
                            newMask |= (1 << litterNum);
                        }

                        if (visited[i][j][newEnergy][newMask]) {
                            continue;
                        }

                        visited[i][j][newEnergy][newMask] = true;
                        queue.offer(new int[] { i, j, newEnergy, newMask });
                    }
                }
            }
            move++;
        }
        return -1;
    }
}
