/**
 * 66. Plus One
 * Difficulty: Easy | Tags: Array, Math
 * https://leetcode.com/problems/plus-one/
 *
 * Pattern: Simulation (Digit Carry)
 * Key insight: Traverse digits from the least-significant end, incrementing and carrying only while a digit is 9; a leading overflow requires a new array with a 1 at the front.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(N) - Allocates an array that scales dynamically with input size
 *
 * Edge Cases Handled: all 9s (leading carry to new array), trailing zeros after carry, single digit 9, last digit not 9 (no carry)
 */
class PlusOne {
    public int[] plusOne(int[] digits) {
        int l = digits.length;
        for (int i = l - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] res = new int[l + 1];
        res[0] = 1;
        return res;

        
    }
}
