/**
 * 2244. Minimum Rounds to Complete All Tasks
 * Difficulty: Medium | Tags: Array, Hash Table, Greedy, Counting
 * https://leetcode.com/problems/minimum-rounds-to-complete-all-tasks/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
 */
class MinimumRoundsToCompleteAllTasks {
    public int minimumRounds(int[] tasks) {
        int rounds = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : tasks) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int i : map.keySet()) {
            if (map.get(i) == 1) {
                return -1;
            }

            int rem = map.get(i) % 3;

            if (rem == 0) {
                rounds += map.get(i) / 3;
            } else if (rem == 2) {
                rounds += map.get(i) / 3 + 1;
            } else if (rem == 1) {
                rounds += map.get(i) / 3 + 1;
            } else {
                rounds = rounds - 1 + 2;
            }
        }
        return rounds;
    }
}
