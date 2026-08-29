/**
 * 347. Top K Frequent Elements
 * Difficulty: Medium | Tags: Array, Hash Table, Divide and Conquer, Sorting, Heap (Priority Queue), Bucket Sort, Counting, Quickselect
 * https://leetcode.com/problems/top-k-frequent-elements/
 *
 * Pattern: Hash Map + Sorting
 * Key insight: Count frequencies in a map, then sort the entries by frequency descending and take the first k keys. (A heap or bucket sort can achieve O(N log k)/O(N).)
 *
 * Time Complexity: O(N log N) - Dominated by the sorting operation on the input array
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
 * Edge Cases Handled: k equals number of distinct elements, all elements same value, ties in frequency, single distinct value
 */
class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(freq.entrySet());
        Collections.sort(list, (a, b) -> Integer.compare(b.getValue(), a.getValue()));
        for (int i = 0; i < k; i++) {
            res[i] = list.get(i).getKey();
        }
        return res;
    }
}
