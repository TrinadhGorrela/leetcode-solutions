/**
 * 142. Linked List Cycle II
 * Difficulty: Medium | Tags: Hash Table, Linked List, Two Pointers, Floyd's Cycle Finding Algorithm
 * https://leetcode.com/problems/linked-list-cycle-ii/
 *
 * Pattern: Two Pointers
 * Key insight: Uses Floyd's cycle-finding algorithm (slow/fast pointers) to detect cycles.
 *
 * Time Complexity: O(N) - Floyd's Cycle Finding traverses nodes in linear time
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: null head (returns null), no cycle (returns null), single node, cycle of length 1
 */
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class LinkedListCycleIi {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
