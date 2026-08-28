/**
 * 1290. Convert Binary Number in a Linked List to Integer
 * Difficulty: Easy | Tags: Linked List, Math
 * https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 *
 * Pattern: Linked List Traversal + Base-2 Conversion
 * Key insight: Concatenate each node's bit into a string as the list is traversed, then parse that binary string into an integer.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(N) - StringBuilder grows with the input size
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
class ConvertBinaryNumberInALinkedListToInteger {
    public int getDecimalValue(ListNode head) {
        StringBuilder res = new StringBuilder();
        while (head != null) {
            res.append(head.val + "");
            head = head.next;
        }

        return Integer.parseInt(res.toString(), 2);
    }
}
