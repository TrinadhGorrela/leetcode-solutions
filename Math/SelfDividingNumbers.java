/**
 * 728. Self Dividing Numbers
 * Difficulty: Easy | Tags: Math
 * https://leetcode.com/problems/self-dividing-numbers/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
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
