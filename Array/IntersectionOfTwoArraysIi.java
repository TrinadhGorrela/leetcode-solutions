/**
 * 350. Intersection of Two Arrays II
 * Difficulty: Easy | Tags: Array, Hash Table, Two Pointers, Binary Search, Sorting
 * https://leetcode.com/problems/intersection-of-two-arrays-ii/
 *
 * Pattern: Array
 * Key insight: Systematically processes the input relying on array principles.
 *
 * Time Complexity: O(N) - HashMap lookup takes linear time
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class IntersectionOfTwoArraysIi {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for (int i : nums1) {
            map1.put(i, map1.getOrDefault(i, 0) + 1);
        }
        for (int i : nums2) {
            if (map1.containsKey(i) && map1.get(i) > 0) {
                res.add(i);
                map1.put(i, map1.get(i) - 1);
            }
        }
        int[] result = new int[res.size()];
        int a = 0;
        for (int t : res) {
            result[a] = t;
            a++;
        }
        return result;
    }
}
