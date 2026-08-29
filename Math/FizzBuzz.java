/**
 * 412. Fizz Buzz
 * Difficulty: Easy | Tags: Math, String, Simulation
 * https://leetcode.com/problems/fizz-buzz/
 *
 * Pattern: Modular Conditional Simulation
 * Key insight: For each number, check divisibility by 15, 3, then 5 in descending precedence, appending the matching token or the number itself.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
* Edge Cases Handled: numbers divisible by both 3 and 5 (FizzBuzz checked first), n = 1, non-divisible numbers output as their own value
 */
class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                res.add("FizzBuzz");
            } else if (i % 3 == 0) {
                res.add("Fizz");
            } else if (i % 5 == 0) {
                res.add("Buzz");
            } else {
                res.add("" + i);
            }
        }
        return res;
    }
}
