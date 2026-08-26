/**
 * 61. Rotate List
 * Difficulty: Medium | Tags: Linked List, Two Pointers
 * https://leetcode.com/problems/rotate-list/
 *
 * Pattern: Linked List
 * Key insight: Systematically processes the input relying on linked list principles.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
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
