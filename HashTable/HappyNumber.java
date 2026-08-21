/**
 * 202. Happy Number
 * Difficulty: Easy | Tags: Hash Table, Math, Two Pointers, Floyd's Cycle Finding Algorithm
 * https://leetcode.com/problems/happy-number/
 *
 * Pattern: Hash Table
 * Key insight: Systematically processes the input relying on hash table principles.
 *
 * Time Complexity: O(log N) amortized - Digit square sum sequence cycles quickly
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> used = new HashSet<>();
        while (true) {
            int sum = 0;
           sum=square(n);
            n = sum;
            if (n == 1)
                return true;

            if (used.contains(n))
                return false;

                
                used.add(n);
        }
    }
    public int square(int n){
        int sum=0;
        int rem=0;
         while (n != 0) {
            rem=n%10;
            sum = sum+(rem*rem);
            n = n / 10;
            }
            return sum;
    }
}
