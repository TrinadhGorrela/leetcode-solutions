/**
 * 2011. Final Value of Variable After Performing Operations
 * Difficulty: Easy | Tags: Array, String, Simulation
 * https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
 *
 * Pattern: Simulation
 * Key insight: Each operation string either increments or decrements X; recognize the two increment forms via string equality and update accordingly.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: only increment ops, only decrement ops, both prefix and postfix forms, single operation
 */
class FinalValueOfVariableAfterPerformingOperations {
    public int finalValueAfterOperations(String[] operations) {
        int res = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("X++") || operations[i].equals("++X")) {
                res++;
            } else {
                res--;
            }
        }
        return res;
    }
}
