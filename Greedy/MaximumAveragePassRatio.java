/**
 * 1792. Maximum Average Pass Ratio
 * Difficulty: Medium | Tags: Array, Greedy, Heap (Priority Queue)
 * https://leetcode.com/problems/maximum-average-pass-ratio/
 *
 * Pattern: Greedy + Max-Heap (Marginal Gain)
 * Key insight: Always add a student to the class with the largest marginal pass-ratio gain, tracked with a max heap keyed by that gain; reinsert after improving each class.
 *
 * Time Complexity: O((N + extraStudents) log N) - Priority queue offer/poll per iteration
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class MaximumAveragePassRatio {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]> max = new PriorityQueue<>((a, b) -> Double.compare(b[0], a[0]));

        for (int[] c : classes) {
            int pass = c[0];
            int total = c[1];
            double gain = (pass + 1.0) / (total + 1) - (double) pass / total;
            max.offer(new double[] { gain, pass, total });
        }

        for (int s = 0; s < extraStudents; s++) {
            double[] top = max.poll();
            double pass = top[1] + 1;
            double total = top[2] + 1;
            double gain = (pass + 1.0) / (total + 1) - (double) pass / total;
            max.offer(new double[] { gain, pass, total });
        }
        double res = 0.0;
        while (!max.isEmpty()) {
            double[] top = max.poll();
            res = res + top[1] / top[2];
        }
        return res / classes.length;
    }
}
