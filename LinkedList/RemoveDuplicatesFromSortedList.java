/**
 * 83. Remove Duplicates from Sorted List
 * Difficulty: Easy | Tags: Linked List
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
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
class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null) {
            return head;
        }
        
        ListNode prev = head;
        ListNode curr = head.next;

        while (curr != null) {
            ListNode next = curr.next;
            if (prev.val == curr.val) {
                prev.next = next;
                curr = curr.next;
            } else {
                prev = curr;
                curr = next;
            }
        }
        return head;
    }
}
