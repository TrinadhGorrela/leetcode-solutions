/**
 * 3069. Distribute Elements Into Two Arrays I
 * Difficulty: Easy | Tags: Array, Simulation
 * https://leetcode.com/problems/distribute-elements-into-two-arrays-i/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
 */
class DistributeElementsIntoTwoArraysI {
    public int[] resultArray(int[] nums) {
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();

        arr1.add(nums[0]);
        arr2.add(nums[1]);

        for (int i = 2; i < nums.length; i++) {
            if (arr1.get(arr1.size() - 1) > arr2.get(arr2.size() - 1)) {
                arr1.add(nums[i]);
            } else {
                arr2.add(nums[i]);
            }
        }

        int in = 0;
        for (int i = 0; i < arr1.size(); i++) {
            nums[in++] = arr1.get(i);
        }

        for (int i = 0; i < arr2.size(); i++) {
            nums[in++] = arr2.get(i);
        }

        return nums;
    }
}

// public int[] resultArray(int[] nums) {
//     int[] arr1 = new int[nums.length];
//     int[] arr2 = new int[nums.length];

//     arr1[0] = nums[0];
//     arr2[0] = nums[1];
//     int s = 0;
//     int t = 0;

//     for (int i = 2; i < nums.length; i++) {
//         if (arr1[s] > arr2[t]) {
//             arr1[++s] = nums[i];
//         } else {
//             arr2[++t] = nums[i];
//         }
//     }

//     System.out.println(Arrays.toString(arr1));
//     System.out.println(Arrays.toString(arr2));

//     int in = 0;
//     for (int i = 0; i <= s; i++) {
//         nums[in++] = arr1[i];
//     }

//     for (int i = 0; i <= t; i++) {
//         nums[in++] = arr2[i];
//     }
//     return nums;
// }
