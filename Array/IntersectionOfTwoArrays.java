/**
 * 349. Intersection of Two Arrays
 * Difficulty: Easy | Tags: Array, Hash Table, Two Pointers, Binary Search, Sorting
 * https://leetcode.com/problems/intersection-of-two-arrays/
 *
 * Pattern: Hash Set
 * Key insight: Load one array into a set, then collect unique elements of the other array that are present in the set.
 *
 * Time Complexity: O(N) - HashSet lookup takes linear time
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> num = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        for (int i : nums2) {
            num.add(i);
        }
        int b = nums1.length;
        for (int i = 0; i < b; i++) {
            if (num.contains(nums1[i])) {
                res.add(nums1[i]);
            }
        }
        int[] result = new int[res.size()];
        int i = 0;
        for (Integer key : res) {
            result[i] = key;
            i++;
        }
        return result;
    }
}
