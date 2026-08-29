/**
 * 326. Power of Three
 * Difficulty: Easy | Tags: Math, Recursion
 * https://leetcode.com/problems/power-of-three/
 *
 * Pattern: Repeated Multiplication (Power Construction)
 * Key insight: Multiply a running value by 3 until it reaches or exceeds n, returning true only if it lands exactly on n.
 *
 * Time Complexity: O(log3 N) - Logarithmic division by 3
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: n = 1 (3^0), exact powers of 3 matched by repeated multiplication, non-powers terminate when the multiplier exceeds int range
 */
class PowerOfThree {
    public boolean isPowerOfThree(int n) {
      int a=1;
      boolean res=false;
      for(int i=0;i<a;i++){
     
        if(a==n){
            res=true;
            break;
        }
           a=a*3;
        }
      return res;
    }
}
