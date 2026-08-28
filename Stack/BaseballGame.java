/**
 * 682. Baseball Game
 * Difficulty: Easy | Tags: Array, Stack, Simulation
 * https://leetcode.com/problems/baseball-game/
 *
 * Pattern: Stack (Simulation)
 * Key insight: Apply each operation against a stack of scores: push raw numbers, pop on C, push 2x the top on D, and push the sum of the top two on +, then total the stack.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class BaseballGame {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("C")) {
                stack.pop();
            } else if (operations[i].equals("+")) {
                int temp1 = stack.pop();
                int temp2 = stack.pop();
                stack.add(temp2);
                stack.add(temp1);
                stack.add(temp1 + temp2);
            } else if (operations[i].equals("D")) {
                int temp = stack.peek();
                stack.add(2 * temp);
            } else {
                stack.add(Integer.parseInt(operations[i]));
            }
        }

        int res = 0;
        
        while (!stack.isEmpty()) {
            res += stack.pop();
        }

        return res;
    }
}
