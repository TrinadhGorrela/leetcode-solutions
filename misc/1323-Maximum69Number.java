/**
 * 1323. Maximum 69 Number
 * Difficulty: Easy | Tags: Math, Greedy
 * https://leetcode.com/problems/maximum-69-number/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
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
