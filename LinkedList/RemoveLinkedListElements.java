/**
 * 203. Remove Linked List Elements
 * Difficulty: Easy | Tags: Linked List, Recursion
 * https://leetcode.com/problems/remove-linked-list-elements/
 *
 * Pattern: Linked List Deletion with Dummy Node
 * Key insight: A dummy node precedes the head to simplify removal of leading matches; unlink every node whose value equals the target, keeping the previous pointer otherwise.
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
class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        dummy.next = head;
        ListNode curr = dummy;
        ListNode prev = dummy;
        while (curr != null) {
            ListNode next = curr.next;
            if (curr.val == val) {
                prev.next = next;
                curr = next;
            } else {
                prev = curr;
                curr = next;
            }

        }
        return dummy.next;
    }
}
