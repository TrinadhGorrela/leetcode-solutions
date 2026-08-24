/**
 * 728. Self Dividing Numbers
 * Difficulty: Easy | Tags: Math
 * https://leetcode.com/problems/self-dividing-numbers/
 *
 * Pattern: Digit Extraction
 * Key insight: Iterate through the range, and for each number, extract its digits using modulo 10 to verify divisibility.
 *
 * Time Complexity: O(N * D) - N is the range size, D is the number of digits (at most 5)
 * Space Complexity: O(1) - constant auxiliary space
 *
 * Edge Cases Handled: Per LeetCode constraints
 */
class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            if (isdiv(i)) {
                res.add(i);
            }
        }
        return res;
    }

    private static boolean isdiv(int num) {
        int temp = num;
        while (num != 0) {
            int last = num % 10;
            if (last == 0) {
                return false;
            } else if (last != 0 && temp % last != 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}
