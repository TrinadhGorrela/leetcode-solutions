/**
 * 1386. Cinema Seat Allocation
 * Difficulty: Medium | Tags: Array, Hash Table, Greedy, Bit Manipulation
 * https://leetcode.com/problems/cinema-seat-allocation/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
 */
class CinemaSeatAllocation {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer, boolean[]> map = new HashMap<>();
        for (int[] i : reservedSeats) {
            int row = i[0];
            int col = i[1];
            map.putIfAbsent(i[0], new boolean[11]);
            boolean[] temp = map.get(row);
            temp[col] = true;
        }

        int res = 0;
        for (int i : map.keySet()) {
            boolean[] temp = map.get(i);

            boolean left = !temp[2] && !temp[3] && !temp[4] && !temp[5];
            boolean right = !temp[6] && !temp[7] && !temp[8] && !temp[9];
            boolean middle = !temp[4] && !temp[5] && !temp[6] && !temp[7];

            if (left) {
                res++;
            }

            if (right) {
                res++;
            }

            if (middle && !left && !right) {
                res++;
            }
        }

        if (map.size() < n) {
            int rem = n - map.size();
            res += rem * 2;
        }

        return res;
    }
}
