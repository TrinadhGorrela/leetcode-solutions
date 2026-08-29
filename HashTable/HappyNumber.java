/**
 * 202. Happy Number
 * Difficulty: Easy | Tags: Hash Table, Math, Two Pointers, Floyd's Cycle Finding Algorithm
 * https://leetcode.com/problems/happy-number/
 *
 * Pattern: Hash Set (Cycle Detection)
 * Key insight: Repeatedly replace n with the sum of the squares of its digits; track seen values, returning true at 1 and false the moment a value repeats (a cycle is reached).
 *
 * Time Complexity: O(log N) amortized - Digit square sum sequence cycles quickly
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
 * Edge Cases Handled: n = 1 (already happy), n = 0, repeated value (cycle detected, returns false), single-digit numbers
 */
class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> used = new HashSet<>();
        while (true) {
            int sum = square(n);
            n = sum;
            if (n == 1)
                return true;

            if (used.contains(n))
                return false;

            used.add(n);
        }
    }

    public int square(int n) {
        int sum = 0;
        int rem = 0;
        while (n != 0) {
            rem = n % 10;
            sum = sum + (rem * rem);
            n = n / 10;
        }
        return sum;
    }
}
