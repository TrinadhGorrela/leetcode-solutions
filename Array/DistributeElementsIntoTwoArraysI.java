/**
 * 3069. Distribute Elements Into Two Arrays I
 * Difficulty: Easy | Tags: Array, Simulation
 * https://leetcode.com/problems/distribute-elements-into-two-arrays-i/
 *
 * Pattern: Simulation
 * Key insight: Place the first two elements into two lists and append each subsequent element to the list whose last element is larger, then concatenate both lists back into the array.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input
 * size
 *
 * Edge Cases Handled: exactly two elements, equal last elements (goes to arr2), negative values
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