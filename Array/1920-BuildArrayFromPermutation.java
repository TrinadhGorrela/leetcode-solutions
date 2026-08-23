/**
 * 1920. Build Array from Permutation
 * Difficulty: Easy | Tags: Array, Simulation
 * https://leetcode.com/problems/build-array-from-permutation/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
 */
class BuildArrayFromPermutation {
    public int[] buildArray(int[] nums) {
      int[] ans=new int[nums.length];
      for(int i=0;i<nums.length;i++){
        ans[i]=nums[nums[i]];
      }  
      return ans;
    }
}
