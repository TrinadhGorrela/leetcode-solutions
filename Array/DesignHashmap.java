/**
 * 706. Design HashMap
 * Difficulty: Easy | Tags: Array, Hash Table, Linked List, Design, Hash Function
 * https://leetcode.com/problems/design-hashmap/
 *
 * Pattern: Array
 * Key insight: Systematically processes the input relying on array principles.
 *
 * Time Complexity: O(1) - Computes the result mathematically without any iteration
 * Space Complexity: O(1) - Only allocates fixed-size arrays independent of input scaling
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class MyHashMap {
    int[] map;

    public MyHashMap() {
        map = new int[1000001];
    }

    public void put(int key, int value) {
        map[key] = value + 1;
    }

    public int get(int key) {
        return map[key] - 1;
    }

    public void remove(int key) {
        map[key] = 0;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
