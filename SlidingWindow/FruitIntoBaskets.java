/**
 * 904. Fruit Into Baskets
 * Difficulty: Medium | Tags: Array, Hash Table, Sliding Window
 * https://leetcode.com/problems/fruit-into-baskets/
 *
 * Pattern: Sliding Window (At Most Two Distinct)
 * Key insight: Expand the right edge adding fruit types; when more than two types are present, shrink the left edge until only two remain, tracking the longest window.
 *
 * Time Complexity: O(N) - Sliding window pointers only move forward
 * Space Complexity: O(1) - Map size is capped at 2
 *
 * Edge Cases Handled: Single element, only one distinct fruit type, more than two types requiring window shrink, type reappearing after being removed from count
 */
class FruitIntoBaskets {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int max = 0;
        for (int right = 0; right < fruits.length; right++) {
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);
            while (map.size() > 2) {
                map.put(fruits[left], map.get(fruits[left]) - 1);
                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
