/**
 * 83. Remove Duplicates from Sorted List
 * Difficulty: Easy | Tags: Linked List
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 *
 * Pattern: Linked List Deletion (previous / current pointers)
 * Key insight: Walk prev and curr; when curr duplicates prev, unlink curr by pointing prev.next beyond it, otherwise advance both; values repeat only in runs because the list is sorted.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: null head (returns null), all nodes duplicate (reduces to one), single node, duplicates at the tail
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
