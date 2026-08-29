/**
 * 876. Middle of the Linked List
 * Difficulty: Easy | Tags: Linked List, Two Pointers
 * https://leetcode.com/problems/middle-of-the-linked-list/
 *
 * Pattern: Two Pointers (Slow / Fast Runner)
 * Key insight: Advance a slow pointer one step and a fast pointer two steps; when the fast pointer reaches the end, the slow pointer sits exactly at the middle (second middle for even length).
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: single node (returns it), even number of nodes (returns the second middle), odd number of nodes
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
