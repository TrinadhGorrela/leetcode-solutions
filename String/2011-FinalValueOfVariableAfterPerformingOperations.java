/**
 * 2011. Final Value of Variable After Performing Operations
 * Difficulty: Easy | Tags: Array, String, Simulation
 * https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
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
