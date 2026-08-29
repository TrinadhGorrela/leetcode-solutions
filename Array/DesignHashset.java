/**
 * 705. Design HashSet
 * Difficulty: Easy | Tags: Array, Hash Table, Linked List, Design, Hash Function
 * https://leetcode.com/problems/design-hashset/
 *
 * Pattern: Hash Set (Bucketing)
 * Key insight: Distribute keys into 1000 buckets using modulo, resolving collisions with a linked list per bucket; contains/remove scan the bucket chain.
 *
 * Time Complexity: O(N) worst case - Linked list traversal in buckets degrades as N grows
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
 * Edge Cases Handled: hash collisions (multiple keys per bucket), key 999 vs 1999 same bucket, duplicate add (idempotent), remove of absent key
 */
class MyHashSet {
    LinkedList<Integer>[] bucketArray;

    public MyHashSet() {
        bucketArray = new LinkedList[1000];
        for (int i = 0; i < 1000; i++) {
            bucketArray[i] = new LinkedList<Integer>();
        }
    }

    public void add(int key) {
        int index = key % 1000;
        if (!bucketArray[index].contains(key)) {
            bucketArray[index].add(key);
        }
    }

    public void remove(int key) {
        int index = key % 1000;
        if (bucketArray[index].contains(key)) {
            bucketArray[index].remove((Integer) key);
        }
    }

    public boolean contains(int key) {
        return bucketArray[key % 1000].contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
