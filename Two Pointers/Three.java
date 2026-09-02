/**
 * 15. 3Sum
 * Difficulty: Medium | Tags: Array, Two Pointers, Sorting
 * https://leetcode.com/problems/3sum/
 *
 * Pattern: Two Pointers + Sorting
 * Key insight: After sorting, fix one element and sweep the remaining subarray with two pointers. Because a sorted
 * array is monotonic, moving the left pointer increases the sum and moving the right pointer decreases it, so each
 * pair is balanced against a fixed target without re-scanning.
 *
 * Time Complexity: O(N^2) - Sorting costs O(N log N); the fixed-loop plus two-pointer scan is O(N^2), which dominates.
 * Space Complexity: O(N) - A HashSet is used to deduplicate triplets, and duplicates are only removed at the end.
 *
 * Edge Cases Handled: null or arrays with fewer than 3 elements (returns empty list); duplicate triplets removed via
 * HashSet; the collection passed to Arrays.asList is never sorted here, only the array itself.
 */
class Three {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3)
            return new ArrayList<>();
        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return new ArrayList<>(res);
    }
}

//  if (nums == null || nums.length < 3)
//             return new ArrayList<>();
//         Set<List<Integer>> res = new HashSet<>();
//         int br = 0;
//         for (int i = 0; i < nums.length - 2; i++) {
//         for (int j = i + 1; j < nums.length - 1; j++) {
//         for (int k = j + 1; k < nums.length; k++) {
//             if (nums[i] + nums[j] + nums[k] == 0) {
//              List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
//             Collections.sort(triplet);
//             res.add(triplet);
//         }

//     }

//     }

//         }
//         return new ArrayList<>(res);
