/**
 * 342. Power of Four
 * Difficulty: Easy | Tags: Math, Bit Manipulation, Recursion
 * https://leetcode.com/problems/power-of-four/
 *
 * Pattern: Repeated Multiplication (Power Construction)
 * Key insight: Multiply a running value by 4 until it reaches or exceeds n, returning true only if it lands exactly on n.
 *
 * Time Complexity: O(log4 N) - Logarithmic division by 4
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: n = 1 (4^0), exact powers of 4 matched by repeated multiplication, non-powers terminate when the multiplier exceeds int range
 */
class PowerOfFour {
    public boolean isPowerOfFour(int n) {
        int a=1;
        boolean res=false;
        for(int i=0;i<a;i++){
         if(a==n){
            res=true;
            break;
         }
         a=a*4;
        }
        return res;
    }
}
