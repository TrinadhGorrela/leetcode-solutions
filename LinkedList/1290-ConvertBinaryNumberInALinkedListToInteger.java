/**
 * 1290. Convert Binary Number in a Linked List to Integer
 * Difficulty: Easy | Tags: Linked List, Math
 * https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
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
