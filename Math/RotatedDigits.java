/**
 * 788. Rotated Digits
 * Difficulty: Medium | Tags: Math, Dynamic Programming
 * https://leetcode.com/problems/rotated-digits/
 *
 * Pattern: Digit Validation (Invalid / Rotating Set)
 * Key insight: A number is good if it contains no ambiguous digit (3,4,7) and at least one rotating digit (2,5,6,9); scan each number's digits and count the good ones.
 *
 * Time Complexity: O(N log N) - Outer loop N, inner loop over digits of i is log i
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
* Edge Cases Handled: ambiguous digit 3/4/7 (invalidated immediately), at least one rotating digit 2/5/6/9 required, digits 0/1/8 rotate to themselves (valid but not rotating), n = 1
 */
class RotatedDigits {
    public int rotatedDigits(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            boolean valid = false;
            int temp = i;
            while (temp != 0) {
                int last = temp % 10;
                if (last == 2 || last == 5 || last == 6 || last == 9) {
                    valid = true;
                } else if (last == 3 || last == 4 || last == 7) {
                    valid = false;
                    break;
                }
                temp /= 10;
            }
            if (valid) {
                res++;
            }
        }
        
        return res;
    }
}
