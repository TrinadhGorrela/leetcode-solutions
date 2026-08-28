/**
 * 92. Reverse Linked List II
 * Difficulty: Medium | Tags: Linked List
 * https://leetcode.com/problems/reverse-linked-list-ii/
 *
 * Pattern: Sub-list Reversal with Dummy Node
 * Key insight: Walk to the node just before left, reverse exactly (right-left+1) nodes in place, then re-attach the head and tail of that reversed segment to the surroundings.
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
class ReverseLinkedListIi {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode leftList = dummy;
        ListNode curr = dummy.next;
        for (int i = 0; i < left - 1; i++) {
            leftList = leftList.next;
            curr = curr.next;
        }

        ListNode subList = curr;

        ListNode prev = null;
        for (int i = 0; i < right - left + 1; i++) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        leftList.next = prev;
        subList.next = curr;
        return dummy.next;
    }
}
