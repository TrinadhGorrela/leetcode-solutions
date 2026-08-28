/**
 * 287. Find the Duplicate Number
 * Difficulty: Medium | Tags: Array, Two Pointers, Binary Search, Bit Manipulation, Pigeonhole Principle, Floyd's Cycle Finding Algorithm
 * https://leetcode.com/problems/find-the-duplicate-number/
 *
 * Pattern: Floyd's Cycle Detection (Tortoise & Hare)
 * Key insight: Treat the array values as pointers in a linked list; the duplicate index is the cycle entry point, found by a slow/fast pointer then a second slow pass starting from index 0.
 *
 * Time Complexity: O(N) - Floyd's cycle detection is linear
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class FindTheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        int slow=0,fast=0;
        do{
            slow=nums[slow];
            fast=nums[nums[fast]];
        }while(slow!=fast);

        slow=0;
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;
    }
}
