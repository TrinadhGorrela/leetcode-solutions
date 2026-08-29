/**
 * 2244. Minimum Rounds to Complete All Tasks
 * Difficulty: Medium | Tags: Array, Hash Table, Greedy, Counting
 * https://leetcode.com/problems/minimum-rounds-to-complete-all-tasks/
 *
 * Pattern: Greedy + Hash Map (Counting / Grouping)
 * Key insight: Each task level must appear at least 2 times (else impossible); the minimum rounds per level is ceil(count/3) since groups of 2 or 3 are allowed, and sum over all levels.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
 * Edge Cases Handled: level appearing exactly once (returns -1), count divisible by 3, count not divisible by 3 (extra group of 2), count = 2 (single round)
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
            } else {
                rounds += map.get(i) / 3 + 1;
            }
        }
        return rounds;
    }
}
