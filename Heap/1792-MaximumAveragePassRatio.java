/**
 * 1792. Maximum Average Pass Ratio
 * Difficulty: Medium | Tags: Array, Greedy, Heap (Priority Queue)
 * https://leetcode.com/problems/maximum-average-pass-ratio/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
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
