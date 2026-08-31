/**
 * 61. Rotate List
 * Difficulty: Medium | Tags: Linked List, Two Pointers
 * https://leetcode.com/problems/rotate-list/
 *
 * Pattern: Circular Link + Cut
 * Key insight: Compute the length, reduce k mod len, then link tail→head to form a cycle. Walk (len - k) steps from head and cut the cycle there—the next node becomes the new head.
 *
 * Time Complexity: O(n) - Two passes: one for length, one to the cut point.
 * Space Complexity: O(1) - Only length counter and traversal pointers.
 *
 * Edge Cases Handled: null list, k mod len == 0 (no rotation needed), k > length (modular reduction), single node, list of two nodes
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
