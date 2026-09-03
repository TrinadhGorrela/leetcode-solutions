/**
 * 15. 3Sum
 * Difficulty: Medium | Tags: Array, Two Pointers, Sorting
 * https://leetcode.com/problems/3sum/
 *
 * Pattern: Sorting + Two Pointers (Fixed One, Sweep Two)
 * Key insight: After sorting, fix one element and use two pointers on the remaining range to find the zero-sum pair. Because the array is sorted, moving the left pointer increases the sum and moving the right pointer decreases it, so the two-pointer scan is correct and avoids the O(N^3) brute force. A HashSet deduplicates triplets.
 *
 * Time Complexity: O(N^2) - Sorting is O(N log N), dominated by the nested loop with inner two-pointer scan
 * Space Complexity: O(N) - HashSet stores up to O(N) unique triplets; sorting may use O(log N) stack space
 *
 * * Edge Cases Handled: null or fewer than 3 elements returns empty list; duplicate triplets deduplicated via HashSet; all elements positive or all negative correctly yields empty result
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
