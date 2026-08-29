/**
 * 61. Rotate List
 * Difficulty: Medium | Tags: Linked List, Two Pointers
 * https://leetcode.com/problems/rotate-list/
 *
 * Pattern: Circular Shift (Length Normalization)
 * Key insight: Compute the list length, reduce k modulo it, link the tail to the head to form a cycle, then walk len-k steps and cut the cycle to expose the new head.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: null head (returns null), k = 0 or k a multiple of length (returns head unchanged), k > length (reduced via modulo), single node
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
class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode curr1 = head;
        ListNode curr2 = head;
        int len = 0;

        if (head == null) {
            return head;
        }

        while (curr1 != null) {
            len++;
            curr1 = curr1.next;
        }

        k = k % len;

        if (k == 0) {
            return head;
        }

        while (curr2.next != null) {
            curr2 = curr2.next;
        }
        
        curr2.next = head;

        ListNode prev = null;
        for (int i = 0; i < len - k; i++) {
            prev = head;
            head = head.next;
        }

        prev.next = null;
        return head;
    }
}
