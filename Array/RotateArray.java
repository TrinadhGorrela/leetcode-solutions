/**
 * 189. Rotate Array
 * Difficulty: Medium | Tags: Array, Math, Two Pointers
 * https://leetcode.com/problems/rotate-array/
 *
 * Pattern: Three Reversals
 * Key insight: Normalize k by n, then reverse the whole array, the first k elements, and the remaining elements — a combined effect that rotates the array right by k positions in-place.
 *
 * Time Complexity: O(N) - Triple-reverse takes linear time
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: k larger than n (normalized by modulo), k = 0, k = n (no effective rotation), single element
 */
class RotateArray {
   public static void rotate(int[] nums, int k) {
		int n=nums.length;
		k=k%n;
		swap(nums,0,n-1);
		swap(nums,0,k-1);
		swap(nums,k,n-1);	
	}
	public static void swap(int[] nums, int left, int right) {
		while (left < right) {
			int temp=nums[left];
			nums[left]=nums[right];
			nums[right]=temp;
			left++;
			right--;
		}
	}
}
