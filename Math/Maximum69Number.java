/**
 * 1323. Maximum 69 Number
 * Difficulty: Easy | Tags: Math, Greedy
 * https://leetcode.com/problems/maximum-69-number/
 *
 * Pattern: Math
 * Key insight: Systematically processes the input relying on math principles.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(N) - Allocates memory for string processing
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class Maximum69Number {
    public int maximum69Number(int num) {
        char[] digits=String.valueOf(num).toCharArray();
        for(int i=0;i<digits.length;i++){
            if(digits[i] == '6'){
                digits[i]='9';
                break;
            }
        }
        return Integer.parseInt(new String(digits));
    }
}
