/**
 * 78. Subsets
 * Difficulty: Medium | Tags: Array, Backtracking, Bit Manipulation
 * https://leetcode.com/problems/subsets/
 *
 * Pattern: Backtracking
 * Key insight: Systematically processes the input relying on backtracking principles.
 *
 * Time Complexity: O(2^N) or O(N!) - Explores combinatorial possibilities via recursion
 * Space Complexity: O(N * 2^N) - Holds all subsets
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class Subsets {
    public List<List<Integer>> subsets(int[] nums){
       List<List<Integer>> res = new ArrayList<>();
       backtrack(0,nums,new ArrayList<>(),res);
       return res;
    }
    public void backtrack(int st ,int[] nums, List<Integer> subset,List<List<Integer>> res){
        res.add(new ArrayList<>(subset));
       for(int i=st;i<nums.length;i++){
        subset.add(nums[i]);
        backtrack(i+1,nums,subset,res);
        subset.remove(subset.size()-1);
       }
    }
}
