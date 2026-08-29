/**
 * 560. Subarray Sum Equals K
 * Difficulty: Medium | Tags: Array, Hash Table, Prefix Sum
 * https://leetcode.com/problems/subarray-sum-equals-k/
 *
 * Pattern: Prefix Sum + Hash Map
 * Key insight: A subarray sums to k when prefixSum[i] - prefixSum[j] = k; count how many prior prefix sums equal prefixSum[i] - k using a map that also seeds prefix 0.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
 * Edge Cases Handled: k = 0, single element equal to k, negative values, subarray spanning whole array, duplicate prefix sums
 */
class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int prefixSum = 0;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            int need = prefixSum - k;
            if (map.containsKey(need)) {
                res += map.get(need);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        return res;
    }
}
